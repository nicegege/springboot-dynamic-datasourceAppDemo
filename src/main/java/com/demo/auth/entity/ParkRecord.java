package com.demo.auth.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 停车记录表(ParkRecord)实体类
 *
 * @author makejava
 * @since 2024-06-05 16:29:56
 */
@Data
public class ParkRecord implements Serializable {
    private static final long serialVersionUID = 646160710285985252L;
    /**
     * 停车场ID
     */
    private Long parkId;
    /**
     * 是否违章 0 否 1是
     */
    private Integer illegal;
    /**
     * 车辆ID
     */
    private Long carId;
    /**
     * 泊位ID
     */
    private Long berthId;
    /**
     * 泊位编码
     */
    private String berthCode;
    
    private Long dataVersion;
    /**
     * 入场时间
     */
    private Long entryTime;
    /**
     * 出场时间
     */
    private Long exitTime;
    /**
     * 0 正常数据 1异常数据
     */
    private Integer exception;
    
    private Integer display;
    /**
     * 修改时间
     */
    private Date updatedTime;
    
    private Date createdTime;
    /**
     * 停车场编码
     */
    private String parkCode;
    /**
     * 车牌号
     */
    private String plateNumber;
    /**
     * ID
     */
    private Long parkRecordId;
    /**
     * 停车记录编码
     */
    private String recordCode;
    /**
     * 状态，0：离场，1：在场，2：出场未识别 3:删除
     */
    private Integer recordState;
    /**
     * 设备编码
     */
    private String hardCode;
    /**
     * 入场流水Id
     */
    private Long entryId;
    
    private String entryOprNum;
    /**
     * 出场流水Id
     */
    private Long exitId;
    
    private String exitOprNum;
    /**
     * 停车数据来源
     */
    private Integer exitDataSource;
    /**
     * 停车数据来源
     */
    private Integer entryDataSource;
}

