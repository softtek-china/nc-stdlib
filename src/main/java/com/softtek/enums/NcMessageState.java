package com.softtek.enums;

/**
 * @author geekeryoung
 * @date 2022/3/1
 * <p>
 * 消息状态
 */

public enum NcMessageState {
    /**
     * 消息状态
     */
    SUCCESS(1), ERROR(2), BLACKLIST(3), WAITING(5), PROCESSING(6);

    private final Integer value;

    private NcMessageState(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
