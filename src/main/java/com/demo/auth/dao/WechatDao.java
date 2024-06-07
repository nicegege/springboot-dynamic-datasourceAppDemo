package com.demo.auth.dao;

import com.demo.auth.entity.Wechat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * (Wechat)表数据库访问层
 *
 * @author makejava
 * @since 2024-06-05 16:31:25
 */
@Mapper
public interface WechatDao extends BaseDao<Wechat>{

}

