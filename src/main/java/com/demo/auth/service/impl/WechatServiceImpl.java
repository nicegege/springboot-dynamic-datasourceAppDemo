package com.demo.auth.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.demo.auth.dao.BaseDao;
import com.demo.auth.dao.WechatDao;
import com.demo.auth.entity.PageResult;
import com.demo.auth.entity.Wechat;
import com.demo.auth.service.BaseServiceImpl;
import com.demo.auth.service.WechatService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Wechat)表服务实现类
 *
 * @author makejava
 * @since 2024-06-05 16:31:25
 */
@Service
public class WechatServiceImpl extends BaseServiceImpl<Wechat> implements WechatService {
    @Resource
    private WechatDao wechatDao;

    @Override
    public BaseDao<Wechat> getBaseDao() {
        return wechatDao;
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
