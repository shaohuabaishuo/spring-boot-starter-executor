package com.jz.enums;

/**
 * @description: 处理结果类
 * @author: jingzhong
 * @time: 2020/9/21 17:41
 */
public enum ExecutorTaskStatusEnum {

    PROCESSING("处理中"),

    EXCEPTION("异常"),

    FAILED("失败"),

    SUCCESS("成功");

    private String desc;

    private ExecutorTaskStatusEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
