package com.demo.auth.entity;

import java.util.HashMap;
import java.util.Map;

public enum ErrorState {
    Success(0, "成功"),
    Failure(1, "失败"),
    TokenNotExist(2, "会话过期"),
    MissParameter(3, "缺少参数"),
    ParamTypeError(4, "参数类型错误"),
    LoginOverTimes(5, "登录次数超过限制"),
    ParamOutRange(6, "参数范围错误"),
    AuthenticationFalse(7, "认证失败"),
    ParamRegexValidateError(8, "正则校验错误"),
    AccountOrPasswordError(9, "账户或错误"),

    DatabaseExcetpion(10, "数据库操作异常"),//数据库操作异常和失败
    ObjectNotExist(11, "对象不存在"),
    AccountExist(12, "账户已存在"),
    AccountNotExist(13, "账户不存在"),
    PasswordError(14, "密码不正确"),
    LoginError(18, "用户名或密码错误"),
    DatabaseNotAllowedDelete(15, "数据已使用不能删除"),
    DatabaseDataUnique(16, "数据唯一，不能再添加"),
    NameExist(17, "姓名重复"),
    InfClosed(20, "接口已经关闭"),
    FrameError(21, "报文体格式或参数错误"),
    FrameEmpty(22, "报文体为空"),
    SignatureError(23, "签名错误"),
    AccessKeyNOExist(24, "accessKey不存在"),
    AccountForbided(25, "用户已经被禁止,请联系管理员"),
    SuccessFirst(26, "首次登录成功"),
    FailureSendMessage(27, "短信发送失败"),
    ParamFormatError(28, "参数格式错误"),
    ServiceAccessException(30, "服务访问异常"),
    SyncFailure(31, "数据同步失败"),
    GraphValidateCodeError(32, "图形验证码错误"),
    LoginOverNum(33, "注册人数超过限制"),
    BerthOverNum(34, "泊位数量不能低于实际泊位数量"),
    EquipmentNotAllowedDelete(35, "设备已被使用或与泊位有关联,不可删除!"),
    FeeNotAllowedModify(36, "计费已绑定车场,不能修改"),
    VerifyCodeNotExist(37, "获取图形验证码失败!"),
    SMSVerifyCodeError(38, "短信验证码错误!"),
    /*绑定相关*/
    DuplicatePlateNumber(41, "重复车牌"),
    PlateNumberBoundAlready(42, "车牌已经被绑定"),
    /*解绑相关*/
    CarNotExit(43, "未出场"),
    CarWithParkingFees(44, "车辆有停车欠费"),
    // 停车记录相关
    EntryNotAllowed(45, "入场验证未通过"),
    ExitNotAllowed(46, "出场验证未通过"),
    DataInconsistent(47, "停车记录数据不一致"),
    ParkRecordAlreadyExit(48, "停车记录已失效，请重新登录加载新数据！"),

    OrcRecordNotExist(50, "流水记录不存在"),
    OcrRecordAlreadyExistParkRecord(51, "已有相同车牌号、不同车牌颜色记录"),
    OcrRecordEntryModifyBerthOverPark(52, "流水自动修改泊位"),
    OcrRecordEntryIgnoreCachePool(53, "流水进入忽略缓存"),
    OcrRecordEntryCachePool(54, "流水进入等待缓存"),
    OcrRecordProcessFailed(55, "流水处理失败"),
    OcrRecordNoPlateNumberCorrect(56, "无牌车校验"),
    OcrRecordPlateNumberCorrect(57, "车牌校验"),
    OcrRecordEntryExitCorrect(58, "出入场校验"),
    OcrRecordExceptionList(59, "流水进入异常列表"),
    OcrRecordEntryAlarm(590, "流水进入入场报警"),

    PaymentInnerPayNoDebt(60, "未产生费用"),
    PaymentRepeatedReportingError(61, "支付流水重复上报"),
    PaymentDeptOrderNotExist(62, "支付的欠费订单不存在"),
    PaymentAmountWrongError(63, "支付流水上报的金额不正确"),
    PaymentBalanceNotEnough(64, "用户余额不足"),
    PaymentParkTimeError(65, "支付的停车时长异常"),
    PaymentIdInnerPayError(66, "场内支付下单号存在多条场内支付订单异常"),
    PaymentComputationalFeeError(67, "计费异常"),
    PaymentInnerPayLongTimeError(68, "场内支付下单时间过长，刷新重新计费"),
    PaymentIdNotExistError(69, "支付流水ID不存在"),
    PaymentPayOrderRepeatError(70, "支付订单重复上报异常"),
    PaymentDebtExistOrder(71, "欠费订单已被下单"),
    PaymentParkRecordEnd(76, "停车记录存已结单"),
    PaymentParkRecordDelete(77, "停车记录已删除"),
    PaymentParkRecordStateError(78, "停车记录状态异常"),
    PaymentRedisDebtExist(79, "欠费记录不存在"),
    PaymentSuccess(80, "支付成功!"),
    PaymentAdditionNotExist(81, "redis中确认支付信息不存在!"),
    NotSupportInnerPayable(82, "该车场不支持场内支付"),
    RefundMoneyTooLarge(83, "退费金额大于订单金额"),
    OrderExistRefund(84, "支付订单不能重复退款"),
    MoneyExitError(85, "下单金额与支付金额不一致"),
    DebtAlreadyPayError(86, "欠费订单已被支付，无法修改！"),
    RuntimeException(97, "运行时异常"),
    ConvertJsonFasle(98, "结果转换为JSON失败"),
    InvalidResource(99, "请求的资源不存在"),
    RepeatRequest(100, "重复请求，稍等在访问！"),
    /*101-105开头是支付服务相关错误*/
    RepeatToPay(101, "重复支付"),
    Lock_Order(106, "您之前的支付发生异常，请在%s内完成支付"),
    ParkNOExist(110, "车场不存在"),
    ParkTypeError(111, "车场类型不正确"),
    ResourceOffline(120, "资源不在线"),
    IndexOutOfBounds(121, "参数超出最大长度限制"),
    /*开票相关*/
    SettingNotFound(130, "未获取到发票设置信息"),
    DuplicateInvoiceOrder(131, "包含的订单中存在已开票数据"),
    SerialNotFound(131, "开票流水不存在"),
    SerialNoOrderFound(132, "开票流水没有对应订单"),
    OrderNotFound(133, "订单不存在"),
    HangXinError(134, "航信操作失败，请检查开票参数"),
    OrderNotOneTenant(135, "订单不属于统一商户或同一类型"),
    OrderPayTypeNotSupport(136, "包含不支持的支付类型"),
    ChannelError(137, "无效的开票渠道"),
    BaiWangError(138, "百旺操作失败，请检查开票参数"),
    InvoiceProcess(139, "开票中"),
    InvalidDataFormat(210, "数据格式错误"),
    DecryptError(298, "解密失败"),
    SystemError(299, "系统错误"),
    SignDataError(300, "签名错误"),
    BeExtrusionLine(301, "被挤掉线,请重新登录"),
    NoWorkerOnline(302, "该中队没有其他同事在线"),
    //提供给普瑞的泊位标定状态码
    NotExistsPark(303, "停车场不存在!"),
    NotExistsBerth(304, "泊位不存在!"),
	/*注销账户*/
	LogoffFailForHasMoney(306, "因您的账户内有余额，为充分保障您的利益，请您将余额用尽后再申请。如需帮助可拨打客服电话：400-133-3990"),
	LogoffFailForHasDebt(307, "因您的账户内有未完成订单，为充分保障您及商户的交易安全及信息完整，请您先完成订单，并在订单完成15天后再申请。"),
	LogoffFailForRecentOrder(305, "因您的账户近15天内有订单记录，为充分保障您及对方的交易安全及信息完整，请您在订单完成15天后再申请。"),
	/* 预约充电  */
	MAKE_ORDER(401, "该车辆已经预约，请勿重复预约"),
	BERTH_FULL(402,"当前充电站泊位已满，请稍后再试"),
	MONEY_CHANGE(403,"预约金额发生变化，请重新预定"),
    /*商品销售相关*/
    GOODS_NOT_EXISTS(500,"商品不存在"),
    GOODS_SOLD_OFF(501,"商品已售完"),
    GOODS_SHELF_OFF(502,"商品已下架"),
    GOODS_NOT_ENOUGH(503,"商品数量不足"),
    GOODS_BUY_REPEAT(510,"商品购买重复已经购买过"),
    GOODS_BUY_NUMBER_OVER(511,"商品购买数量超过限购数量"),

    /**
     * 优惠券
     */
    COUPON_NOT_EXISTS(600,"优惠券已被抢光啦 关注郑好停公众号，领幸运好礼！");


    private int state;
    private String desc;

    private ErrorState(int state, String desc) {
        this.state = state;
        this.desc = desc;
    }

    public int getState() {
        return state;
    }

    public String getDesc() {
        return desc;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static ErrorState getByState(int state) {
        ErrorState array[] = ErrorState.values();
        int start = 0, end = array.length - 1;
        int midd;

        while (start <= end) {
            midd = (start + end) / 2;
            int dt = array[midd].state;
            if (state > dt) {
                start = midd + 1;
            } else if (state < dt) {
                end = midd - 1;
            } else {
                return array[midd];
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{\"state\":").append(state);
        builder.append(",\"desc\":\"").append(desc);
        builder.append("\"}");
        return builder.toString();
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("state", state);
        map.put("desc", desc);
        return map;
    }
}
