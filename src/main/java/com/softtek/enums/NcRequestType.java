package com.softtek.enums;

/**
 * @author geekeryoung
 * @date 2022/3/1
 * <p>
 * 请求类型
 */
public enum NcRequestType {
    /**
     * 请求类型
     */
    REALTIME(1), SCHEDULE(2);

    private final Integer value;

    private NcRequestType(Integer value) {
        this.value = value;
    }

    /**
     * 获取值
     */
    public Integer getValue() {
        return this.value;
    }
}
