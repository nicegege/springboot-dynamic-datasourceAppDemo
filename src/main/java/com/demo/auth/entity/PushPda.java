package com.demo.auth.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (PushPda)实体类
 *
 * @author makejava
 * @since 2024-06-05 16:32:02
 */
@Data
public class PushPda implements Serializable {
    private static final long serialVersionUID = 472245748214359873L;
    
    private Date updatedTime;
    /**
     * 操作人ID
     */
    private Long operatorId;
    /**
     * 调用方服务名称
     */
    private String caller;
    /**
     * 1：ios,2：android
     */
    private Integer customerType;
    
    private Date createdTime;
    /**
     * 消息类型
     */
    private Integer msgType;
    /**
     * 模版code
     */
    private Integer tmplCode;
    /**
     * 删除标识1：有效，2删除
     */
    private Integer pushState;
    /**
     * 推送类型:1-通知,2-消息
     */
    private Integer pushType;
    /**
     * 业务相关
     */
    private String extras;
    /**
     * 用户别名
     */
    private String userAlias;
    /**
     * 消息内容
     */
    private String content;
    /**
     * 标题
     */
    private String title;
    /**
     * 任务Id
     */
    private Long taskId;
    /**
     * 主键
     */
    private Long id;
}

