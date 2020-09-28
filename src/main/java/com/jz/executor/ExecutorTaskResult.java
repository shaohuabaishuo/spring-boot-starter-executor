package com.jz.executor;


import com.jz.enums.ExecutorErrorCodeEnum;
import com.jz.enums.ExecutorTaskStatusEnum;

/**
 * @description:
 * @author: jingzhong
 * @time: 2020/9/21 17:47
 */
public class ExecutorTaskResult {
    //执行状态
    private ExecutorTaskStatusEnum statusEnum;
    //错误信息
    private String message;
    //错误码
    private ExecutorErrorCodeEnum codeEnum;

    public ExecutorTaskStatusEnum getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(ExecutorTaskStatusEnum statusEnum) {
        this.statusEnum = statusEnum;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ExecutorErrorCodeEnum getCodeEnum() {
        return codeEnum;
    }

    public void setCodeEnum(ExecutorErrorCodeEnum codeEnum) {
        this.codeEnum = codeEnum;
    }
}
