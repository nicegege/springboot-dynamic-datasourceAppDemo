CREATE TABLE `t_wechat` (
                            `id` bigint(20) NOT NULL COMMENT '主键',
                            `taskId` bigint(20) NOT NULL COMMENT '短信Id',
                            `memberId` bigint(20) NOT NULL COMMENT '会员ID',
                            `openId` varchar(50) NOT NULL COMMENT '微信唯一表示',
                            `wechatMsgType` varchar(50) DEFAULT NULL COMMENT '微信消息类型',
                            `content` varchar(500) NOT NULL COMMENT '短信内容',
                            `tmplCode` int(10) DEFAULT '0' COMMENT '模版code',
                            `msgType` tinyint(4) DEFAULT '0' COMMENT '消息类型',
                            `wechatState` tinyint(4) DEFAULT '1' COMMENT '删除标识1：有效，2删除',
                            `createdTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                            `updatedTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
                            `resultCode` varchar(64) DEFAULT NULL COMMENT '第三方短信平台返回码',
                            `caller` varchar(200) DEFAULT NULL COMMENT '调用方服务名称',
                            `operatorId` bigint(20) DEFAULT NULL COMMENT '操作人ID',
                            PRIMARY KEY (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;



CREATE TABLE `t_push_pda` (
                              `id` bigint(20) NOT NULL COMMENT '主键',
                              `taskId` bigint(20) NOT NULL COMMENT '任务Id',
                              `title` varchar(200) NOT NULL COMMENT '标题',
                              `content` varchar(500) NOT NULL COMMENT '消息内容',
                              `userAlias` varchar(200) NOT NULL COMMENT '用户别名',
                              `extras` varchar(200) DEFAULT NULL COMMENT '业务相关',
                              `pushType` tinyint(4) DEFAULT '1' COMMENT '推送类型:1-通知,2-消息',
                              `pushState` tinyint(4) DEFAULT '1' COMMENT '删除标识1：有效，2删除',
                              `tmplCode` int(10) DEFAULT '0' COMMENT '模版code',
                              `msgType` tinyint(4) DEFAULT '0' COMMENT '消息类型',
                              `createdTime` datetime DEFAULT CURRENT_TIMESTAMP,
                              `updatedTime` datetime DEFAULT CURRENT_TIMESTAMP,
                              `customerType` tinyint(4) DEFAULT '1' COMMENT '1：ios,2：android',
                              `caller` varchar(200) DEFAULT NULL COMMENT '调用方服务名称',
                              `operatorId` bigint(20) DEFAULT '0' COMMENT '操作人ID',
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

CREATE TABLE `t_push_app` (
                              `id` bigint(20) NOT NULL COMMENT '主键',
                              `taskId` bigint(20) NOT NULL COMMENT '推送Id',
                              `title` varchar(200) NOT NULL COMMENT '标题',
                              `content` varchar(500) NOT NULL COMMENT '消息内容',
                              `userAlias` varchar(200) NOT NULL COMMENT '用户别名',
                              `extras` varchar(500) DEFAULT NULL COMMENT '业务相关',
                              `pushType` tinyint(4) DEFAULT '1' COMMENT '推送类型:1-通知,2-消息',
                              `pushState` tinyint(4) DEFAULT '1' COMMENT '删除标识1：有效，2删除',
                              `tmplCode` int(10) DEFAULT '0' COMMENT '模版code',
                              `msgType` tinyint(4) DEFAULT '0' COMMENT '消息类型',
                              `createdTime` datetime DEFAULT CURRENT_TIMESTAMP,
                              `updatedTime` datetime DEFAULT CURRENT_TIMESTAMP,
                              `customerType` tinyint(4) DEFAULT '1' COMMENT '1：ios,2：android',
                              `deviceToken` varchar(200) DEFAULT NULL COMMENT '设备token, IOS传deviceToken',
                              `phoneNumber` varchar(11) DEFAULT NULL COMMENT '会员手机号',
                              `caller` varchar(200) DEFAULT NULL COMMENT '调用方服务名称',
                              `operatorId` bigint(20) DEFAULT '0' COMMENT '操作人ID',
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='推送消息表';