CREATE TABLE `t_park_record_spss` (
                                      `parkRecordId` bigint(20) NOT NULL COMMENT 'ID',
                                      `recordCode` varchar(36) DEFAULT NULL COMMENT '停车记录编码',
                                      `recordState` tinyint(1) NOT NULL DEFAULT '1' COMMENT '状态，0：离场，1：在场，2：出场未识别 3:删除',
                                      `D` tinyint(1) DEFAULT '0' COMMENT '0:正常，1：删除',
                                      `entryId` bigint(20) DEFAULT NULL COMMENT '入场流水Id',
                                      `exitId` bigint(20) DEFAULT NULL COMMENT '出场流水Id',
                                      `entryDataSource` tinyint(4) NOT NULL COMMENT '停车数据来源',
                                      `exitDataSource` tinyint(4) DEFAULT NULL COMMENT '停车数据来源',
                                      `entryTime` bigint(20) NOT NULL COMMENT '入场时间',
                                      `exitTime` bigint(20) DEFAULT NULL COMMENT '出场时间',
                                      `parkId` bigint(20) NOT NULL COMMENT '停车场ID',
                                      `berthId` bigint(20) DEFAULT NULL COMMENT '停车位ID',
                                      `carId` bigint(20) DEFAULT '0' COMMENT '车辆ID',
                                      `memberId` bigint(20) DEFAULT '0' COMMENT '会员Id',
                                      `plateNumber` varchar(20) NOT NULL COMMENT '车牌号',
                                      `carType` tinyint(1) DEFAULT '1' COMMENT '车辆类型1：小型车，2：中型车，3：大型车',
                                      `carColor` varchar(50) DEFAULT NULL COMMENT '车辆颜色',
                                      `shouldPay` int(11) DEFAULT '0' COMMENT '应收金额（单位：分）',
                                      `actualPay` int(11) DEFAULT '0' COMMENT '实收金额（单位：分）',
                                      `agioPay` int(11) DEFAULT '0' COMMENT '优惠金额（单位：分）',
                                      `illegal` tinyint(1) DEFAULT '0' COMMENT '是否违章 1=违章，0=未违章',
                                      `createdTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
                                      `operationId` bigint(20) DEFAULT '0' COMMENT '运营商id',
                                      `updatedTime` timestamp(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '修改时间',
                                      `parkType` tinyint(4) DEFAULT NULL COMMENT '停车场类型，1：路侧平行 2： 路侧垂停车场，3：封闭车场，4：半封闭车场',
                                      `areaId` bigint(20) DEFAULT NULL COMMENT '区域ID',
                                      `parentParkId` bigint(20) DEFAULT NULL COMMENT '停车车场父ID',
                                      `exitOprNum` varchar(36) DEFAULT NULL COMMENT '出场流水号',
                                      `entryOprNum` varchar(36) DEFAULT NULL COMMENT '入场流水号',
                                      `entryPdaManagerId` bigint(20) DEFAULT '0' COMMENT '入场收费员Id',
                                      `berthCode` varchar(36) DEFAULT NULL COMMENT '泊位编码',
                                      PRIMARY KEY (`parkRecordId`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='停车记录表';