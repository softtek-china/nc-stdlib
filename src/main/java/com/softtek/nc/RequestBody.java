package com.softtek.nc;

import lombok.Data;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author geekeryoung
 * @date 2022/3/1
 *
 * 请求消息体
 */

@Data
public class RequestBody {
    /**
     * 请求 Id
     */
    @Positive
    private Integer reqId;

    /**
     * 消息 Id
     */
    @Positive
    private Integer msgId;

    /**
     * 追踪 Id
     */
    @NotBlank
    private String traceId;

    /**
     * 消息类型
     */
    @Positive
    private Integer msgType;

    /**
     * 应用 Id
     */
    @Positive
    private Integer appId;

    /**
     * 供应商账户 Id
     */
    @Positive
    private Integer vendorId;

    /**
     * 是否需要回调
     */
    @Max(1)
    @Min(0)
    private Integer isCallback;

    /**
     * 请求类型
     * 1 实时, 2 定时
     */
    @Max(2)
    @Min(1)
    private Integer reqType;

    /**
     * 接收人
     */
    @NotEmpty
    private List<Receiver> receiver;

    /**
     * 模板 Id
     */
    @NotBlank
    private String templateId;

    /**
     * 三方模板 Id
     */
    private String linkedTemplateId;

    /**
     * csv 文件路径
     */
    private String csvPath;

    /**
     * 请求时间
     */
    private Date reqTime;

    /**
     * 发送时间
     */
    private Date sendTime;

    /**
     * 额外参数
     */
    @NotNull
    private Map<String, String> opts;
}
