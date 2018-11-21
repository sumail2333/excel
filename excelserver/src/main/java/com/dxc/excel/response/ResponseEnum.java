package com.dxc.excel.response;

public enum ResponseEnum {
    UNKNOWN_ERROR(-100, "未知错误"),
    NEED_LOGIN(-1, "未登录"),
    USER_NOT_EXIST(-3, "不存在该用户"),
    SUCCESS(0, "success"),
    SYSTEM_ERROR(-1000001,"系统错误");

    private Integer code;

    private String msg;

    private ResponseEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
