package com.demo.auth.controller;

import com.demo.auth.entity.PageResult;
import com.demo.auth.entity.ParkRecord;
import com.demo.auth.entity.PushApp;
import com.demo.auth.entity.ResponseResult;
import com.demo.auth.service.PushAppService;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * 推送消息表(PushApp)表控制层
 *
 * @author makejava
 * @since 2024-06-05 16:31:44
 */
@RestController
@RequestMapping("/pushApp")
public class PushAppController extends BaseController<PushApp> {

    private static final Logger log = LoggerFactory.getLogger(PushAppController.class);
    /**
     * 服务对象
     */
    @Resource
    private PushAppService pushAppService;


    @Override
    public String getPrimaryKeyName() {
        return "id";
    }

    @Override
    public void expandParamMap(Map<String, Object> paramMap) {
        long startTime = (long)paramMap.get("startTime");
        long endTime = (long)paramMap.get("endTime");
        paramMap.put("startTime",new Date(startTime));
        paramMap.put("endTime",new Date(endTime));
    }

    @Override
    public PageResult<PushApp> queryPageResult(Map<String, Object> paramMap, Integer page, Integer pageSize) {
        return pushAppService.list(paramMap,page,pageSize);
    }

    @Override
    public Integer save2(PushApp pushApp) {
        return pushAppService.save2(pushApp);
    }

    @Override
    public PushApp queryById2(PushApp pushApp) {
       return pushAppService.queryById2(pushApp.getId());
    }

    @Override
    public Integer delete(List<Long> idList) {
        return pushAppService.delete(idList);
    }

    @Override
    public Logger getLog() {
        return log;
    }
}

