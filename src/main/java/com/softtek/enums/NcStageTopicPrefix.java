package com.softtek.enums;

/**
 * @author geekeryoung
 * @date 2022/3/1
 * <p>
 * 持久化 topic
 */
public enum NcStageTopicPrefix {

    /**
     * 预处理
     */
    PREPROCESSOR("PREPROCESSOR"),

    /**
     * 分发器
     */
    GATEWAY_ADAPTER("GATEWAY_ADAPTER"),

    /**
     * 定时消息
     */
    SCHEDULER("SCHEDULER"),

    /**
     * 定时CSV文件
     */
    SCHEDULER_CSV("SCHEDULER_CSV"),

    /**
     * 回调预处理
     */
    CALLBACK_PREPROCESSOR("CALLBACK_PREPROCESSOR"),

    /**
     * 回调上游
     */
    CALLBACK_CLIENT("CALLBACK_CLIENT");

    private final String topic;

    private NcStageTopicPrefix(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }
}
