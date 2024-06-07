package com.demo.auth.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.demo.auth.dao.BaseDao;
import com.demo.auth.dao.OcrRecordDao;
import com.demo.auth.entity.OcrRecord;
import com.demo.auth.entity.PageResult;
import com.demo.auth.service.BaseServiceImpl;
import com.demo.auth.service.OcrRecordService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 路侧车位上报记录表
(OcrRecord)表服务实现类
 *
 * @author makejava
 * @since 2024-06-05 16:29:27
 */
@Service
public class OcrRecordServiceImpl extends BaseServiceImpl<OcrRecord> implements OcrRecordService {
    @Resource
    private OcrRecordDao ocrRecordDao;

    @Override
    public BaseDao<OcrRecord> getBaseDao() {
        return ocrRecordDao;
    }

    @Override
    public String primaryDbName() {
        return "busidb";
    }

    @Override
    public String moveDbName() {
        return "bak";
    }

//    /**
//     * 通过ID查询单条数据
//     *
//     * @param ocrrecordid 主键
//     * @return 实例对象
//     */
//    @DS("busidb")
//    @Override
//    public OcrRecord queryById(Long ocrrecordid) {
//        return this.ocrRecordDao.selectByPrimaryKey(ocrrecordid);
//    }
//
//    /**
//     * 分页查询
//     * @param paramMap 筛选条件
//     * @param page  分页页码
//     * @param pageSize  分页大小
//     * @return 查询结果
//     */
//    @DS("busidb")
//    @Override
//    public PageResult<OcrRecord> list(Map paramMap, Integer page, Integer pageSize) {
//        PageResult<OcrRecord> pageResult = new PageResult<>();
//        Page<OcrRecord> pageRes = PageHelper.startPage(page, pageSize);
//        List<OcrRecord> retList = this.ocrRecordDao.listByCondition(paramMap);
//        if (pageRes != null){
//            pageResult.setTotal(pageRes.getTotal());
//        } else {
//            pageResult.setTotal(0L);
//        }
//
//        pageResult.setList(retList);
//        return pageResult;
//    }
//
//    /**
//     * 新增数据
//     *
//     * @param ocrRecord 实例对象
//     * @return
//     */
//    @DS("busidb")
//    @Override
//    public Integer save(OcrRecord ocrRecord) {
//        this.ocrRecordDao.insertSelective(ocrRecord);
//        return 1;
//    }
//
//    /**
//     * 修改数据
//     *
//     * @param ocrRecord 实例对象
//     * @return
//     */
//    @DS("busidb")
//    @Override
//    public Integer edit(OcrRecord ocrRecord) {
//        return this.ocrRecordDao.updateByPrimaryKeySelective(ocrRecord);
//    }
//    @DS("busidb")
//    @Override
//    public int delete(List<Long> idList) {
//        // 查询多条数据
//        return this.ocrRecordDao.delete(idList);
//    }
//
//
//    /**
//     * 通过ID查询单条数据
//     *
//     * @param ocrrecordid 主键
//     * @return 实例对象
//     */
//    @DS("bak")
//    @Override
//    public OcrRecord queryById2(Long ocrrecordid) {
//        return this.ocrRecordDao.selectByPrimaryKey(ocrrecordid);
//    }
//
//    /**
//     * 分页查询
//     * @param paramMap 筛选条件
//     * @param page  分页页码
//     * @param pageSize  分页大小
//     * @return 查询结果
//     */
//    @DS("bak")
//    @Override
//    public PageResult<OcrRecord> list2(Map paramMap, Integer page, Integer pageSize) {
//        PageResult<OcrRecord> pageResult = new PageResult<>();
//        Page<OcrRecord> pageRes = PageHelper.startPage(page, pageSize);
//        List<OcrRecord> retList = this.ocrRecordDao.listByCondition(paramMap);
//        if (pageRes != null){
//            pageResult.setTotal(pageRes.getTotal());
//        } else {
//            pageResult.setTotal(0L);
//        }
//
//        pageResult.setList(retList);
//        return pageResult;
//    }
//
//    @DS("bak")
//    @Override
//    public Integer save2(OcrRecord ocrRecord) {
//        return this.ocrRecordDao.insertSelective(ocrRecord);
//
//    }
//    @DS("bak")
//    @Override
//    public Integer edit2(OcrRecord ocrRecord) {
//        return this.ocrRecordDao.updateByPrimaryKeySelective(ocrRecord);
//    }

}
