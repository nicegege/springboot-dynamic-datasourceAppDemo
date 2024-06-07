package com.demo.auth.dao;

import com.demo.auth.entity.OcrRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 路侧车位上报记录表
(OcrRecord)表数据库访问层
 *
 * @author makejava
 * @since 2024-06-05 16:29:25
 */
@Mapper
public interface OcrRecordDao extends BaseDao<OcrRecord>{

}

