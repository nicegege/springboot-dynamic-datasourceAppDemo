package com.demo.auth.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 停车记录表(ParkRecordSpss)实体类
 *
 * @author makejava
 * @since 2024-06-05 16:30:15
 */
@Data
public class ParkRecordSpss implements Serializable {
    private static final long serialVersionUID = -42774970764833049L;
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
     * 入场流水Id
     */
    private Long entryId;
    /**
     * 出场流水Id
     */
    private Long exitId;
    /**
     * 停车数据来源
     */
    private Integer entryDataSource;
    /**
     * 停车数据来源
     */
    private Integer exitDataSource;
    /**
     * 入场时间
     */
    private Long entryTime;
    /**
     * 出场时间
     */
    private Long exitTime;
    /**
     * 停车场ID
     */
    private Long parkId;
    /**
     * 停车位ID
     */
    private Long berthId;
    /**
     * 车辆ID
     */
    private Long carId;
    /**
     * 会员Id
     */
    private Long memberId;
    /**
     * 车牌号
     */
    private String plateNumber;
    /**
     * 车辆类型1：小型车，2：中型车，3：大型车
     */
    private Integer carType;
    /**
     * 车辆颜色
     */
    private String carColor;
    /**
     * 应收金额（单位：分）
     */
    private Integer shouldPay;
    /**
     * 实收金额（单位：分）
     */
    private Integer actualPay;
    /**
     * 优惠金额（单位：分）
     */
    private Integer agioPay;
    /**
     * 是否违章 1=违章，0=未违章
     */
    private Integer illegal;
    
    private Date createdTime;
    /**
     * 运营商id
     */
    private Long operationId;
    /**
     * 修改时间
     */
    private Date updatedTime;
    /**
     * 停车场类型，1：路侧平行 2： 路侧垂停车场，3：封闭车场，4：半封闭车场
     */
    private Integer parkType;
    /**
     * 区域ID
     */
    private Long areaId;
    /**
     * 停车车场父ID
     */
    private Long parentParkId;
    /**
     * 出场流水号
     */
    private String exitOprNum;
    /**
     * 入场流水号
     */
    private String entryOprNum;
    /**
     * 入场收费员Id
     */
    private Long entryPdaManagerId;
    /**
     * 泊位编码
     */
    private String berthCode;
}

