package com.demo.auth.controller;

import com.demo.auth.entity.OcrRecord;
import com.demo.auth.entity.PageResult;
import com.demo.auth.entity.ResponseResult;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BaseController<T>{
    public abstract String getPrimaryKeyName();
    public abstract void expandParamMap(Map<String,Object> paramMap);
    public abstract PageResult<T> queryPageResult(Map<String,Object> paramMap,Integer page,Integer pageSize);
    public abstract Integer save2(T t);
    public abstract T queryById2(T t);
    public abstract Integer delete(List<Long> idList);
    public abstract Logger getLog();


    @GetMapping("/queryAndMove")
    public ResponseResult<Object> queryAndMove(
            @RequestParam(name = "recordId",required = false) Long recordId,
            @RequestParam(name = "startTime") Long startTime,
            @RequestParam(name = "endTime") Long endTime,
            @RequestParam(name = "page")Integer page,
            @RequestParam(name = "pageSize")Integer pageSize) {

        if(startTime > endTime){
            return ResponseResult.replyFail("startTime 应小于 endTime");
        }
        Map<String,Object> paramMap = new HashMap();
        if(recordId != null){
            paramMap.put(getPrimaryKeyName(),recordId);
        }

        paramMap.put("startTime",startTime);
        paramMap.put("endTime",endTime);
        expandParamMap(paramMap);
        PageResult<T> pageResult = queryPageResult(paramMap,page,pageSize);

        if(pageResult == null || pageResult.getTotal() == 0){
            return ResponseResult.replySuccess(0);
        }

        long total = pageResult.getTotal();
        List<T> list = pageResult.getList();
        long addTotal = 0;
        long subTotal =0;
        List<Long> idList = null;
        while(total > 0 && !list.isEmpty()){
            idList = new ArrayList<>(pageSize);
            for (T t:list) {
                save2(t);
                addTotal++;
                T t2 = queryById2(t);
                if(t2 != null){
                    idList.add(getPrimaryKeyValue(t,getPrimaryKeyName()));
                }
            }
            if(idList.size()>0){
                int deleteCount = delete(idList);
                subTotal +=idList.size();
                getLog().info("删除数量为idListSize:{},deleteCount:{}",idList.size(),deleteCount);
                idList.clear();
            }
            pageResult = queryPageResult(paramMap, page, pageSize);

            if(pageResult == null || pageResult.getTotal() == 0){
                Map<String,Long> result = new HashMap<>();
                result.put("addTotal",addTotal);
                result.put("subTotal",subTotal);
                return ResponseResult.replySuccess(result);
            }
            total = pageResult.getTotal();
            list = pageResult.getList();
        }
        return ResponseResult.replySuccess(pageResult.getTotal());
    }

    public Long getPrimaryKeyValue(T t,String primaryKeyName){
        try {
            Field field = t.getClass().getDeclaredField(primaryKeyName);
            field.setAccessible(true); // 使私有属性可访问
            Long value = (Long) field.get(t);
            return value;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return 0L;
    }
}
