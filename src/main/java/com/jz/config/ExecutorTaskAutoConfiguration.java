package com.jz.config;

import com.jz.executor.RetryExecutorTask;
import com.jz.properties.ExecutorTaskProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
@EnableConfigurationProperties(value = ExecutorTaskProperties.class)
@ConditionalOnProperty(name = "executor.task.enable", havingValue = "true")
public class ExecutorTaskAutoConfiguration {

    @Resource
    private ExecutorTaskProperties executorTaskProperties;

    @Bean
    public RetryExecutorTask initRetryExecutorTask(){
        return new RetryExecutorTask();
    }
}
