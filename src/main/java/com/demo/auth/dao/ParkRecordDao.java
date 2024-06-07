package com.demo.auth.dao;

import com.demo.auth.entity.ParkRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 停车记录表(ParkRecord)表数据库访问层
 *
 * @author makejava
 * @since 2024-06-05 16:29:56
 */
@Mapper
public interface ParkRecordDao extends BaseDao<ParkRecord>{
}

