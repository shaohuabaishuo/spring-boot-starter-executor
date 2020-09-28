-- 任务表
CREATE TABLE `enterprise_task` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `task_id` varchar(64) NOT NULL COMMENT '任务的业务唯一标识',
  `task_type` varchar(64) NOT NULL DEFAULT '' COMMENT '任务类型',
  `task_class_name` varchar(256) NOT NULL DEFAULT '' COMMENT '任务对应class全名称',
  `status` varchar(32) NOT NULL DEFAULT '' COMMENT '任务执行状态',
  `error_code` varchar(64) NOT NULL DEFAULT '' COMMENT '执行失败错误代码',
  `error_message` varchar(512) NOT NULL DEFAULT '' COMMENT '执行失败错误消息',
  `retry_status` varchar(32) NOT NULL DEFAULT '' COMMENT '重试状态',
  `times` int(11) NOT NULL DEFAULT '0' COMMENT '任务执行的次数',
  `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `next_execute_time` datetime NOT NULL DEFAULT '1900-01-01 00:00:00' COMMENT '任务重试的下次执行时间',
  `request_detail` varchar(2000) NOT NULL DEFAULT '' COMMENT '结果附加信息',
  `result_detail` varchar(2000) NOT NULL DEFAULT '' COMMENT '结果附加信息',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UQ_TASKID_TYPE` (`task_type`,`task_id`),
  KEY `IDX_NEXT_EXE_TIME` (`retry_status`,`next_execute_time`),
  KEY `IDX_UPDATE_TIME` (`update_time`)
) COMMENT='企业任务';