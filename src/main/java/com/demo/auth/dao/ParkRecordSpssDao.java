package com.demo.auth.dao;

import com.demo.auth.entity.ParkRecordSpss;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 停车记录表(ParkRecordSpss)表数据库访问层
 *
 * @author makejava
 * @since 2024-06-05 16:30:15
 */
@Mapper
public interface ParkRecordSpssDao extends BaseDao<ParkRecordSpss>{

}

