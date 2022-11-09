package com.riding.springcloud.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver implements Serializable {
    private Integer id;
    private String name;
    private String  plateNumber;
    private String  phoneNumber;
    private Integer money;
    private Integer available;
}
