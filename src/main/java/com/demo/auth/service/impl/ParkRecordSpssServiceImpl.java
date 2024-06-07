package com.demo.auth.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.demo.auth.dao.BaseDao;
import com.demo.auth.dao.ParkRecordSpssDao;
import com.demo.auth.entity.PageResult;
import com.demo.auth.entity.ParkRecordSpss;
import com.demo.auth.service.BaseServiceImpl;
import com.demo.auth.service.ParkRecordSpssService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 停车记录表(ParkRecordSpss)表服务实现类
 *
 * @author makejava
 * @since 2024-06-05 16:30:15
 */
@Service
public class ParkRecordSpssServiceImpl extends BaseServiceImpl<ParkRecordSpss> implements ParkRecordSpssService {
    @Resource
    private ParkRecordSpssDao parkRecordSpssDao;

    @Override
    public BaseDao<ParkRecordSpss> getBaseDao() {
        return parkRecordSpssDao;
    }

    @Override
    public String primaryDbName() {
        return "spss";
    }

    @Override
    public String moveDbName() {
        return "bak";
    }
}
