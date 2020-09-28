package com.jz.executor;

import com.jz.mysql.executor.write.dao.ExecutorTaskDo;
import com.jz.mysql.executor.write.dao.ExecutorTaskMapper;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

/**
 * @description:
 * @author: jingzhong
 * @time: 2020/9/25 11:32
 */
@Slf4j
public class RetryExecutorTask {


    private ExecutorTaskMapper executorTaskMapper;


    public <T extends ExecutorTaskResult> T execute(ExecutorTask<T> executorTask) {
        return executorTask.doExecute();
    }

    private <T extends ExecutorTaskResult> void saveTask(ExecutorTask<T> executorTask) {
        ExecutorTaskDo executorTaskDo = new ExecutorTaskDo();
        executorTaskDo.setTaskId(executorTask.getTaskId());
        executorTaskDo.setTaskType(executorTask.getTaskType());
        executorTaskDo.setTaskClassName(executorTask.getClass().getName());

        executorTaskMapper.save(executorTaskDo);
    }
}
