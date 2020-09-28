package com.jz.executor;

/**
 * @description:
 * @author: jingzhong
 * @time: 2020/9/21 17:47
 */

public interface ExecutorTask<T extends ExecutorTaskResult> {

    /**
     * 获取任务id
     *
     * @return
     */
    String getTaskId();

    /**
     * 获取任务类型
     *
     * @return
     */
    String getTaskType();

    /**
     * 执行任务
     *
     * @return
     */
    T doExecute();
}
