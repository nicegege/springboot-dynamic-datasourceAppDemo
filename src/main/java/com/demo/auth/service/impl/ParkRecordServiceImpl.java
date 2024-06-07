package com.demo.auth.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.demo.auth.dao.BaseDao;
import com.demo.auth.dao.ParkRecordDao;
import com.demo.auth.entity.PageResult;
import com.demo.auth.entity.ParkRecord;
import com.demo.auth.service.BaseServiceImpl;
import com.demo.auth.service.ParkRecordService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 停车记录表(ParkRecord)表服务实现类
 *
 * @author makejava
 * @since 2024-06-05 16:29:56
 */
@Service
public class ParkRecordServiceImpl extends BaseServiceImpl<ParkRecord> implements ParkRecordService {
    @Resource
    private ParkRecordDao parkRecordDao;

    @Override
    public BaseDao<ParkRecord> getBaseDao() {
        return parkRecordDao;
    }

    @Override
    public String primaryDbName() {
        return "busidb";
    }

    @Override
    public String moveDbName() {
        return "bak";
    }
//
//    /**
//     * 通过ID查询单条数据
//     *
//     * @param parkrecordid 主键
//     * @return 实例对象
//     */
//    @DS("busidb")
//    @Override
//    public ParkRecord queryById(Long parkrecordid) {
//        return this.parkRecordDao.selectByPrimaryKey(parkrecordid);
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
//    public PageResult<ParkRecord> list(Map paramMap, Integer page, Integer pageSize) {
//        PageResult<ParkRecord> pageResult = new PageResult<>();
//        Page<ParkRecord> pageRes = PageHelper.startPage(page, pageSize);
//        List<ParkRecord> retList = this.parkRecordDao.listByCondition(paramMap);
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
//     * @param parkRecord 实例对象
//     * @return
//     */
//    @DS("busidb")
//    @Override
//    public Integer save(ParkRecord parkRecord) {
//        this.parkRecordDao.insertSelective(parkRecord);
//        return 1;
//    }
//
//    /**
//     * 修改数据
//     *
//     * @param parkRecord 实例对象
//     * @return
//     */
//    @DS("busidb")
//    @Override
//    public Integer edit(ParkRecord parkRecord) {
//        return this.parkRecordDao.updateByPrimaryKeySelective(parkRecord);
//    }
//
//    @DS("busidb")
//    @Override
//    public int delete(List<Long> idList) {
//        // 查询多条数据
//        return this.parkRecordDao.delete(idList);
//    }
//
//    @DS("bak")
//    @Override
//    public Integer save2(ParkRecord parkRecord) {
//        this.parkRecordDao.insertSelective(parkRecord);
//        return 1;
//    }
//    @DS("bak")
//    @Override
//    public ParkRecord queryById2(Long parkrecordid) {
//        return this.parkRecordDao.selectByPrimaryKey(parkrecordid);
//    }
}
