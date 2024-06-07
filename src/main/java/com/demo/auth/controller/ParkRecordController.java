package com.demo.auth.controller;

import com.demo.auth.entity.OcrRecord;
import com.demo.auth.entity.PageResult;
import com.demo.auth.entity.ParkRecord;
import com.demo.auth.entity.ResponseResult;
import com.demo.auth.service.ParkRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 停车记录表(ParkRecord)表控制层
 *
 * @author makejava
 * @since 2024-06-05 16:29:56
 */
@RestController
@RequestMapping("/parkRecord")
public class ParkRecordController extends BaseController<ParkRecord>{

    private static final Logger log = LoggerFactory.getLogger(ParkRecordController.class);
    /**
     * 服务对象
     */
    @Resource
    private ParkRecordService parkRecordService;

    @Override
    public String getPrimaryKeyName() {
        return "parkRecordId";
    }

    @Override
    public void expandParamMap(Map<String, Object> paramMap) {
        paramMap.put("entryDataSource",99);
    }

    @Override
    public PageResult<ParkRecord> queryPageResult(Map<String, Object> paramMap, Integer page, Integer pageSize) {
        return parkRecordService.list(paramMap,page,pageSize);
    }

    @Override
    public Integer save2(ParkRecord parkRecord) {
        return parkRecordService.save2(parkRecord);
    }

    @Override
    public ParkRecord queryById2(ParkRecord parkRecord) {
        return parkRecordService.queryById2(parkRecord.getParkRecordId());
    }

    @Override
    public Integer delete(List<Long> idList) {
        return parkRecordService.delete(idList);
    }

    @Override
    public Logger getLog() {
        return log;
    }

//    @GetMapping("/queryAndMove")
//    public ResponseResult<Object> queryAndMove(
//            @RequestParam(name = "parkRecordId",required = false) Long parkRecordId,
//            @RequestParam(name = "startTime") Long startTime,
//            @RequestParam(name = "endTime") Long endTime,
//            @RequestParam(name = "page")Integer page,
//            @RequestParam(name = "pageSize")Integer pageSize) {
//
//        if(startTime > endTime){
//            return ResponseResult.replyFail("startTime 应小于 endTime");
//        }
//        Map<String,Object> paramMap = new HashMap();
//        if(parkRecordId != null){
//            paramMap.put("parkRecordId",parkRecordId);
//        }
//        paramMap.put("entryDataSource",99);
//        paramMap.put("startTime",startTime);
//        paramMap.put("endTime",endTime);
//        PageResult<ParkRecord> pageResult = this.parkRecordService.list(paramMap, page, pageSize);
//
//        if(pageResult == null || pageResult.getTotal() == 0){
//            return ResponseResult.replySuccess(0);
//        }
//
//        long total = pageResult.getTotal();
//        List<ParkRecord> list = pageResult.getList();
//        long addTotal = 0;
//        long subTotal =0;
//        List<Long> idList = null;
//        while(total > 0 && !list.isEmpty()){
//            idList = new ArrayList<>(pageSize);
//            for (ParkRecord parkRecord:list) {
//                int addCount =0;
//                try{
//                    addCount  = parkRecordService.save2(parkRecord);
//                    addTotal++;
//                }catch (Exception e){
//                    e.printStackTrace();
//                    log.info("parkRecordId:{},save2失败：{}",parkRecord.getParkRecordId(),e.getMessage());
//                }
//                ParkRecord parkRecord2 = parkRecordService.queryById2(parkRecord.getParkRecordId());
//                if(parkRecord2 != null){
//                    idList.add(parkRecord2.getParkRecordId());
//                }
//            }
//            if(idList.size()>0){
//                int deleteCount = parkRecordService.delete(idList);
//                subTotal +=idList.size();
//                log.info("删除数量为idListSize:{},deleteCount:{}",idList.size(),deleteCount);
//                idList.clear();
//            }
//            pageResult = this.parkRecordService.list(paramMap, page, pageSize);
//
//            if(pageResult == null || pageResult.getTotal() == 0){
//                Map<String,Long> result = new HashMap<>();
//                result.put("addTotal",addTotal);
//                result.put("subTotal",subTotal);
//                return ResponseResult.replySuccess(result);
//            }
//            total = pageResult.getTotal();
//            list = pageResult.getList();
//        }
//        return ResponseResult.replySuccess(pageResult.getTotal());
//    }

}

