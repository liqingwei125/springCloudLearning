package com.lqw.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author by lqw
 * @Classname Payment
 * @Desc TODO
 * @Date 2022/3/10 17:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private long id;

    private String serial;

}
