package com.demo.auth.service;

import com.demo.auth.entity.OcrRecord;
import com.demo.auth.entity.PageResult;

import java.util.List;
import java.util.Map;

public interface BaseService<T> {
    T queryById(Long id);

    PageResult<T> list(Map paramMap, Integer page, Integer pageSize);

    Integer save(T t);

    Integer edit(T t);

    int delete(List<Long> idList);

    T queryById2(Long id);

    PageResult<T> list2(Map paramMap, Integer page, Integer pageSize);

    Integer save2(T t);

    Integer edit2(T t);
}
