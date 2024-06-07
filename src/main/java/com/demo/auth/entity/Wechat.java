package com.demo.auth.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Wechat)实体类
 *
 * @author makejava
 * @since 2024-06-05 16:31:25
 */
@Data
public class Wechat implements Serializable {
    private static final long serialVersionUID = 807966173581912286L;
    /**
     * 更新时间
     */
    private Date updatedTime;
    /**
     * 会员ID
     */
    private Long memberId;
    /**
     * 调用方服务名称
     */
    private String caller;
    /**
     * 操作人ID
     */
    private Long operatorId;
    /**
     * 第三方短信平台返回码
     */
    private String resultCode;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 删除标识1：有效，2删除
     */
    private Integer wechatState;
    /**
     * 消息类型
     */
    private Integer msgType;
    /**
     * 模版code
     */
    private Integer tmplCode;
    /**
     * 短信内容
     */
    private String content;
    /**
     * 微信消息类型
     */
    private String wechatMsgType;
    /**
     * 微信唯一表示
     */
    private String openId;
    /**
     * 短信Id
     */
    private Long taskId;
    /**
     * 主键
     */
    private Long id;
}

