package com.demo.auth.controller;

import com.demo.auth.entity.PageResult;
import com.demo.auth.entity.ResponseResult;
import com.demo.auth.entity.Wechat;
import com.demo.auth.service.WechatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * (Wechat)表控制层
 *
 * @author makejava
 * @since 2024-06-05 16:31:25
 */
@RestController
@RequestMapping("/wechat")
public class WechatController extends BaseController<Wechat>{

    private static final Logger log = LoggerFactory.getLogger(WechatController.class);
    /**
     * 服务对象
     */
    @Resource
    private WechatService wechatService;


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
    public PageResult<Wechat> queryPageResult(Map<String, Object> paramMap, Integer page, Integer pageSize) {
        return wechatService.list(paramMap,page,pageSize);
    }

    @Override
    public Integer save2(Wechat wechat) {
        return wechatService.save2(wechat);
    }

    @Override
    public Wechat queryById2(Wechat wechat) {
        return wechatService.queryById2(wechat.getId());
    }


    @Override
    public Integer delete(List<Long> idList) {
        return wechatService.delete(idList);
    }

    @Override
    public Logger getLog() {
        return log;
    }
}

