package com.softtek.nc;

/**
 * @author geekeryoung
 * @date 2022/3/1
 * <p>
 * 消息类型
 */
public enum MessageType {
    /**
     * 消息类型
     */
    SMS(1), PUSH(2), EMAIL(3), EDM(4), WECHAT(5), ALIPAY(6), INBOX(7);

    private final Integer value;

    private MessageType(Integer value) {
        this.value = value;
    }

    /**
     * 获取值
     */
    public Integer getValue() {
        return this.value;
    }
}
