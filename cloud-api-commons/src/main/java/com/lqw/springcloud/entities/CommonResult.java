package com.lqw.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author by lqw
 * @Classname CommonResult
 * @Desc TODO
 * @Date 2022/3/10 17:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;

    private String message;

    private T     data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

}
