package com.softtek.enums;

/**
 * @author geekeryoung
 * @date 2022/3/1
 * <p>
 * 持久化 topic
 */
public enum NcPersistentTopic {

    /**
     * 请求持久化
     */
    REQUEST_PERSIST("REQ_STORE"),

    /**
     * 消息持久化
     */
    MESSAGE_PERSIST("MSG_STORE"),

    /**
     * 消息日志持久化
     */
    PERSIST_MESSAGE_LOG("EVENT_STORE"),

    /**
     * 回调持久化
     */
    PERSIST_MESSAGE_CALLBACK("MSG_CB_STORE");

    private final String topic;

    private NcPersistentTopic(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }
}
