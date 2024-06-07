package com.demo.auth.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.demo.auth.dao.BaseDao;
import com.demo.auth.dao.PushAppDao;
import com.demo.auth.entity.PageResult;
import com.demo.auth.entity.PushApp;
import com.demo.auth.service.BaseServiceImpl;
import com.demo.auth.service.PushAppService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 推送消息表(PushApp)表服务实现类
 *
 * @author makejava
 * @since 2024-06-05 16:31:48
 */
@Service
public class PushAppServiceImpl extends BaseServiceImpl<PushApp> implements PushAppService {
    @Resource
    private PushAppDao pushAppDao;

    @Override
    public BaseDao<PushApp> getBaseDao() {
        return pushAppDao;
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
