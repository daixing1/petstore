//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.cb.sp.petstore.util;

/**
* @description TODO
* @author 戴兴
* @date 2018/12/11 20:46
*/
public class BizException extends RuntimeException {
    private static final long serialVersionUID = 1335927018262190674L;
    public static final BizException DB_INSERT_RESULT_0 = new BizException(90040001, "数据库操作,insert返回0", new Object[0]);
    public static final BizException DB_UPDATE_RESULT_0 = new BizException(90040002, "该数据不存在或已被修改，请刷新后重试！", new Object[0]);
    public static final BizException DB_DELETE_RESULT_0 = new BizException(90040002, "删除的数据不存在，请刷新后重试！", new Object[0]);
    public static final BizException DB_SELECTONE_IS_NULL = new BizException(90040003, "数据库操作,selectOne返回null", new Object[0]);
    public static final BizException DB_LIST_IS_NULL = new BizException(90040004, "数据库操作,list返回null", new Object[0]);
    public static final BizException TOKEN_IS_ILLICIT = new BizException(90040005, "Token 验证非法", new Object[0]);
    public static final BizException PERMISSION_NOT_FOUND = new BizException(90040005, "权限不存在", new Object[0]);
    public static final BizException SESSION_IS_OUT_TIME = new BizException(90040006, "会话超时", new Object[0]);
    public static final BizException DB_GET_SEQ_NEXT_VALUE_ERROR = new BizException(90040007, "获取序列出错", new Object[0]);
    public static final BizException COOKIE_IS_ILLICIT = new BizException(90040005, "Cookie 验证非法", new Object[0]);
    public static final BizException DB_SELECT_IS_FAIL = new BizException(90040008, "数据库操作,查询数据失败", new Object[0]);
    public static final BizException SEND_QUEUE_FAIL = new BizException(90040009, "发送队列消息失败~！", new Object[0]);
    public static final BizException DB_DML_FAIL = new BizException(90040010, "服务内部错误，请稍后重试", new Object[0]);
    public static final BizException PAGE_PARAM_DELETION = new BizException(90040011, "分页参数缺失~！", new Object[0]);
    public static final BizException PARAM_DELETION = new BizException(90040012, "参数缺失~！", new Object[0]);
    public static final BizException PARAM_IS_NULL = new BizException(90040013, "param is null", new Object[0]);
    protected String msg;
    protected int code;

    public BizException(int code, String msgFormat, Object... args) {
        super(String.format(msgFormat, args));
        this.code = code;
        this.msg = String.format(msgFormat, args);
    }

    public BizException() {
    }

    public String getMsg() {
        return this.msg;
    }

    public int getCode() {
        return this.code;
    }

    public BizException newInstance(String msgFormat, Object... args) {
        return new BizException(this.code, msgFormat, args);
    }

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public BizException(Throwable cause) {
        super(cause);
    }

    public BizException(String message) {
        super(message);
    }
}
