package com.demo.auth.controller;

import com.demo.auth.entity.PageResult;
import com.demo.auth.entity.ParkRecord;
import com.demo.auth.entity.ParkRecordSpss;
import com.demo.auth.entity.ResponseResult;
import com.demo.auth.service.ParkRecordSpssService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 停车记录表(ParkRecordSpss)表控制层
 *
 * @author makejava
 * @since 2024-06-05 16:30:15
 */
@RestController
@RequestMapping("/parkRecordSpss")
public class ParkRecordSpssController extends BaseController<ParkRecordSpss>{

    private static final Logger log = LoggerFactory.getLogger(ParkRecordSpssController.class);
    /**
     * 服务对象
     */
    @Resource
    private ParkRecordSpssService parkRecordSpssService;


    @Override
    public String getPrimaryKeyName() {
        return "parkRecordId";
    }

    @Override
    public void expandParamMap(Map<String, Object> paramMap) {
        paramMap.put("tableName","t_park_record");
        paramMap.put("entryDataSource",99);
    }

    @Override
    public PageResult<ParkRecordSpss> queryPageResult(Map<String, Object> paramMap, Integer page, Integer pageSize) {
        return parkRecordSpssService.list(paramMap,page,pageSize);
    }

    @Override
    public Integer save2(ParkRecordSpss parkRecordSpss) {
        return parkRecordSpssService.save2(parkRecordSpss);
    }

    @Override
    public ParkRecordSpss queryById2(ParkRecordSpss parkRecordSpss) {
        return parkRecordSpssService.queryById2(parkRecordSpss.getParkRecordId());
    }

    @Override
    public Integer delete(List<Long> idList) {
        return parkRecordSpssService.delete(idList);
    }

    @Override
    public Logger getLog() {
        return log;
    }
}

