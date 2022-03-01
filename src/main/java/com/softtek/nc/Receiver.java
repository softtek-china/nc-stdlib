package com.softtek.nc;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import java.util.Map;

/**
 * @author geekeryoung
 * @date 2022/3/1
 *
 * 接收人
 */

@Data
public class Receiver {
    /**
     * 接收者id
     * customerId、手机号、邮箱
     */
    @NotBlank
    private String id;

    /**
     * 模板变量
     */
    private Map<String, String> attributes;
}
