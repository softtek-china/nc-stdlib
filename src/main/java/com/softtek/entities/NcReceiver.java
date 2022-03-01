package com.softtek.entities;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

/**
 * @author geekeryoung
 * @date 2022/3/1
 * <p>
 * 接收人
 */

@Data
public class NcReceiver {
    /**
     * 接收者id
     * customerId、手机号、邮箱
     */
    @NotBlank
    private String id;

    /**
     * 模板变量
     */
    @NotNull
    private Map<String, String> attributes = new HashMap<>();
}
