package com.demo.auth.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 路侧车位上报记录表
(OcrRecord)实体类
 *
 * @author makejava
 * @since 2024-06-05 16:29:25
 */
@Data
public class OcrRecord implements Serializable {
    private static final long serialVersionUID = 687569132112173126L;
    /**
     * 主键Id
     */
    private Long ocrRecordId;
    /**
     * 设备硬件ID
     */
    private Long equipmentId;
    /**
     * 设备硬件码
     */
    private String hardCode;
    /**
     * 泊位ID
     */
    private Long berthId;
    /**
     * 泊位编码
     */
    private String berthCode;
    /**
     * 车场ID
     */
    private Long parkId;
    /**
     * 车场编码
     */
    private String parkCode;
    /**
     * 车牌号
     */
    private String plateNumber;
    /**
     * 车辆ID
     */
    private Long carId;
    
    private Long lastCarId;
    /**
     * 图片抓拍时间
     */
    private Long captureTime;
    /**
     * 1=入场，0=出场
     */
    private Integer type;
    /**
     * 车辆类型1=小，2=中，3=大
     */
    private Integer carType;
    /**
     * 车牌颜色
     */
    private Integer plateColor;
    /**
     * 数据来源:
     */
    private Integer dataSource;
    /**
     * 流水号
     */
    private String oprNum;
    /**
     * 入场流水号
     */
    private String entryOprNum;
    /**
     * 修改后的泊位
     */
    private String lastBerthCode;
    /**
     * 修改后的车牌
     */
    private String lastPlateNumber;
    /**
     * 修改后的出入场类型
     */
    private Integer lastType;
    /**
     * 出入场置信度
     */
    private Integer eventReliability;
    /**
     * 车牌置信度
     */
    private Integer plateReliability;
    /**
     * 宽度
     */
    private Integer width;
    /**
     * 高度
     */
    private Integer height;
    /**
     * x轴
     */
    private Integer xAxis;
    /**
     * y轴
     */
    private Integer yAxis;
    /**
     * 操作收费员Id
     */
    private Long pdaManagerId;
    
    private Date createdTime;
    /**
     * 时间戳
     */
    private Date updatedTime;
    
    private Integer dataSourceDetail;
    
    private Long dataVersion;
}

