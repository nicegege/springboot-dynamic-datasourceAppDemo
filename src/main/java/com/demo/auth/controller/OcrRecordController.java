package com.demo.auth.controller;

import com.demo.auth.entity.OcrRecord;
import com.demo.auth.entity.PageResult;
import com.demo.auth.entity.ResponseResult;
import com.demo.auth.service.OcrRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * 路侧车位上报记录表
(OcrRecord)表控制层
 *
 * @author makejava
 * @since 2024-06-05 16:29:21
 */
@RestController
@RequestMapping("/ocrRecord")
public class OcrRecordController extends BaseController<OcrRecord>{

    private static final Logger log = LoggerFactory.getLogger(OcrRecordController.class);
    /**
     * 服务对象
     */
    @Resource
    private OcrRecordService ocrRecordService;

    @Override
    public String getPrimaryKeyName() {
        return "ocrRecordId";
    }

    @Override
    public void expandParamMap(Map<String, Object> paramMap) {
        paramMap.put("dataSource","99");

    }

    @Override
    public PageResult<OcrRecord> queryPageResult(Map<String, Object> paramMap, Integer page, Integer pageSize) {
        return ocrRecordService.list(paramMap,page,pageSize);
    }

    @Override
    public Integer save2(OcrRecord ocrRecord) {
        return ocrRecordService.save2(ocrRecord);
    }

    @Override
    public OcrRecord queryById2(OcrRecord ocrRecord) {
        return ocrRecordService.queryById2(ocrRecord.getOcrRecordId());
    }

    @Override
    public Integer delete(List<Long> idList) {
        return ocrRecordService.delete(idList);
    }

    @Override
    public Logger getLog() {
        return log;
    }

    /**
     * 分页查询
     * http://localhost:8081/ocrRecord/list?ocrRecordId=ocrRecordId&page=1&pageSize=1000&startTime=1600937703&endTime=1709654400000
     * @param page  分页页码
     * @param pageSize  分页大小
     * @return 查询结果
     */
//    @GetMapping("/queryAndMove")
//    public ResponseResult<Object> queryAndMove(
//            @RequestParam(name = "ocrRecordId",required = false) Long ocrRecordId,
//            @RequestParam(name = "startTime") Long startTime,
//            @RequestParam(name = "endTime") Long endTime,
//            @RequestParam(name = "page")Integer page,
//            @RequestParam(name = "pageSize")Integer pageSize) {
//
//        if(startTime > endTime){
//            return ResponseResult.replyFail("startTime 应小于 endTime");
//        }
//        Map<String,Object> paramMap = new HashMap();
//        if(ocrRecordId != null){
//            paramMap.put("ocrRecordId",ocrRecordId);
//        }
//        paramMap.put("dataSource",99);
//        paramMap.put("startTime",startTime);
//        paramMap.put("endTime",endTime);
//        PageResult<OcrRecord> pageResult = this.ocrRecordService.list(paramMap, page, pageSize);
//
//        if(pageResult == null || pageResult.getTotal() == 0){
//            return ResponseResult.replySuccess(0);
//        }
//
//        long total = pageResult.getTotal();
//        List<OcrRecord> list = pageResult.getList();
//        long addTotal = 0;
//        long subTotal =0;
//        List<Long> idList = null;
//        while(total > 0 && !list.isEmpty()){
//            idList = new ArrayList<>(pageSize);
//            for (OcrRecord ocrRecord:list) {
//               int addCount =0;
//               try{
//                   addCount  = ocrRecordService.save2(ocrRecord);
//                   addTotal++;
//               }catch (Exception e){
//                   e.printStackTrace();
//                   log.info("ocrRecordRecordId:{},save2失败：{}",ocrRecord.getOcrRecordId(),e.getMessage());
//               }
//                OcrRecord ocrRecord2 = ocrRecordService.queryById2(ocrRecord.getOcrRecordId());
//                if(ocrRecord2 != null){
//                    idList.add(ocrRecord2.getOcrRecordId());
//                }
//            }
//            if(idList.size()>0){
//                int deleteCount = ocrRecordService.delete(idList);
//                subTotal +=idList.size();
//                log.info("删除数量为idListSize:{},deleteCount:{}",idList.size(),deleteCount);
//                idList.clear();
//            }
//            pageResult = this.ocrRecordService.list(paramMap, page, pageSize);
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

