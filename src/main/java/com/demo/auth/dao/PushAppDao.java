package com.demo.auth.dao;

import com.demo.auth.entity.PushApp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 推送消息表(PushApp)表数据库访问层
 *
 * @author makejava
 * @since 2024-06-05 16:31:45
 */
@Mapper
public interface PushAppDao extends BaseDao<PushApp>{
}

