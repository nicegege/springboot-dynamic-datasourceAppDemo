package com.demo.auth.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.demo.auth.dao.BaseDao;
import com.demo.auth.entity.OcrRecord;
import com.demo.auth.entity.PageResult;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import java.util.List;
import java.util.Map;

public abstract class BaseServiceImpl<T> implements BaseService<T> {

    public abstract BaseDao<T> getBaseDao();

    public abstract String primaryDbName();
    public abstract String moveDbName();

    @DS("#{primaryDbName()}")
    @Override
    public T queryById(Long id) {
        return getBaseDao().selectByPrimaryKey(id);
    }
    @DS("#{primaryDbName()}")
    @Override
    public PageResult<T> list(Map paramMap, Integer page, Integer pageSize) {

        PageResult<T> pageResult = new PageResult<>();
        Page<T> pageRes = PageHelper.startPage(page, pageSize);
        List<T> retList = getBaseDao().listByCondition(paramMap);;
        if (pageRes != null){
            pageResult.setTotal(pageRes.getTotal());
        } else {
            pageResult.setTotal(0L);
        }
        pageResult.setList(retList);
        return pageResult;
    }
    @DS("#{primaryDbName()}")
    @Override
    public Integer save(T t) {
        return getBaseDao().insertSelective(t);
    }
    @DS("#{primaryDbName()}")
    @Override
    public Integer edit(T t) {
        return getBaseDao().updateByPrimaryKeySelective(t);
    }
    @DS("#{primaryDbName()}")
    @Override
    public int delete(List<Long> idList) {
        return getBaseDao().delete(idList);
    }
    @DS("#{moveDbName()}")
    @Override
    public T queryById2(Long id) {
        return getBaseDao().selectByPrimaryKey(id);
    }
    @DS("#{moveDbName()}")
    @Override
    public PageResult<T> list2(Map paramMap, Integer page, Integer pageSize) {
        PageResult<T> pageResult = new PageResult<>();
        Page<T> pageRes = PageHelper.startPage(page, pageSize);
        List<T> retList = getBaseDao().listByCondition(paramMap);;
        if (pageRes != null){
            pageResult.setTotal(pageRes.getTotal());
        } else {
            pageResult.setTotal(0L);
        }
        pageResult.setList(retList);
        return pageResult;
    }
    @DS("#{moveDbName()}")
    @Override
    public Integer save2(T t) {
        return getBaseDao().insertSelective(t);
    }
    @DS("#{moveDbName()}")
    @Override
    public Integer edit2(T t) {
        return getBaseDao().updateByPrimaryKeySelective(t);
    }
}
