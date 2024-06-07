package com.demo.auth.dao;

import com.demo.auth.entity.PushPda;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * (PushPda)表数据库访问层
 *
 * @author makejava
 * @since 2024-06-05 16:32:02
 */
@Mapper
public interface PushPdaDao extends BaseDao<PushPda>{

}

