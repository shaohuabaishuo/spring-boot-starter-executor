package com.jz.enums;

/**
 * @description:
 * @author: jingzhong
 * @time: 2020/9/21 17:57
 */
public enum ExecutorErrorCodeEnum {

    ERROR_CODE_SUCCESS("10000", "操作成功"),
    ERROR_CODE_FILED("10001", "操作失败");

    ExecutorErrorCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
