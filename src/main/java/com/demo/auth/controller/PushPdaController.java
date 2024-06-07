package com.demo.auth.controller;

import com.demo.auth.entity.PageResult;
import com.demo.auth.entity.ParkRecord;
import com.demo.auth.entity.PushPda;
import com.demo.auth.entity.ResponseResult;
import com.demo.auth.service.PushPdaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * (PushPda)表控制层
 *
 * @author makejava
 * @since 2024-06-05 16:32:02
 */
@RestController
@RequestMapping("/pushPda")
public class PushPdaController extends BaseController<PushPda>{

    private static final Logger log = LoggerFactory.getLogger(PushPdaController.class);
    /**
     * 服务对象
     */
    @Resource
    private PushPdaService pushPdaService;


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
    public PageResult<PushPda> queryPageResult(Map<String, Object> paramMap, Integer page, Integer pageSize) {
        return pushPdaService.list(paramMap,page,pageSize);
    }

    @Override
    public Integer save2(PushPda pushPda) {
        return pushPdaService.save2(pushPda);
    }

    @Override
    public PushPda queryById2(PushPda pushPda) {

       return pushPdaService.queryById2(pushPda.getId());
    }

    @Override
    public Integer delete(List<Long> idList) {
        return pushPdaService.delete(idList);
    }

    @Override
    public Logger getLog() {
        return log;
    }
}

