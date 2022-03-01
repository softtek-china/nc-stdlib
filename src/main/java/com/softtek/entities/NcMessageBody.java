package com.softtek.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.*;

/**
 * @author geekeryoung
 * @date 2022/3/1
 * <p>
 * 消息体
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NcMessageBody<T> {
    /**
     * 请求 Id
     */
    @Positive
    private Integer reqId = null;

    /**
     * 消息 Id
     */
    @Positive
    private Integer msgId = null;

    /**
     * 追踪 Id
     */
    @NotBlank
    private String traceId = null;

    /**
     * 消息类型
     * 参考: NcMessageType
     */
    @Positive
    private Integer msgType = null;

    /**
     * 应用 Id
     */
    @Positive
    private Integer appId = null;

    /**
     * 供应商账户 Id
     */
    @Positive
    private Integer vendorId = null;

    /**
     * 是否需要回调
     */
    @Max(1)
    @Min(0)
    private Integer isCallback = null;

    /**
     * 请求类型
     * 参考: NcRequestType
     */
    @Positive
    private Integer reqType = null;

    /**
     * 接收人
     */
    @Size(min = 1, max = 1)
    private List<NcReceiver> receiver = new ArrayList<>();

    /**
     * 模板 Id
     */
    @NotBlank
    private String templateId = null;

    /**
     * 三方模板 Id
     */
    private String linkedTemplateId = null;

    /**
     * 消息状态
     * 参考: NcMessageState
     */
    @Positive
    private Integer state = null;

    /**
     * csv 文件路径
     */
    private String csvPath = null;

    /**
     * 请求时间
     */
    @NotNull
    private Date reqTime = null;

    /**
     * 发送时间
     */
    private Date sendTime = null;

    /**
     * 下游响应时间
     */
    private Date responseTime = null;

    /**
     * 下游响应体
     */
    private T responseBody = null;

    /**
     * 发送重试次数
     */
    @Positive
    private Integer retry = 0;

    /**
     * 并发拦截次数
     */
    @Positive
    private Integer concurrentInterception = 0;

    /**
     * 下游消息 Id
     */
    private String vendorMsgId = null;

    /**
     * 额外参数
     */
    @NotNull
    private Map<String, String> opts = new HashMap<>();
}
