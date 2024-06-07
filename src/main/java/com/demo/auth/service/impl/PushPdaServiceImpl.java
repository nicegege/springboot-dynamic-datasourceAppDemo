package com.demo.auth.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.demo.auth.dao.BaseDao;
import com.demo.auth.dao.PushPdaDao;
import com.demo.auth.entity.PageResult;
import com.demo.auth.entity.PushPda;
import com.demo.auth.service.BaseServiceImpl;
import com.demo.auth.service.PushPdaService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (PushPda)表服务实现类
 *
 * @author makejava
 * @since 2024-06-05 16:32:02
 */
@Service
public class PushPdaServiceImpl extends BaseServiceImpl<PushPda> implements PushPdaService {
    @Resource
    private PushPdaDao pushPdaDao;

    @Override
    public BaseDao<PushPda> getBaseDao() {
        return pushPdaDao;
    }

    @Override
    public String primaryDbName() {
        return "notice";
    }

    @Override
    public String moveDbName() {
        return "bak";
    }
}
