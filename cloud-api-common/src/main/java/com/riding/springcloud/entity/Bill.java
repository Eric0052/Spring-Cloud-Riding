package com.riding.springcloud.entity;


import cn.hutool.core.date.DateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bill implements Serializable {
    private Integer id;
    private Integer price;
    private Integer passengerId;
    private Integer driverId;
    private Integer arrived;
    private Integer payed;
}
