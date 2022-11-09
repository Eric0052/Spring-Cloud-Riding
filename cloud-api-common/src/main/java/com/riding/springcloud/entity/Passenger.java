package com.riding.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger implements Serializable
{
    private Integer id;
    private String name;
    private String phoneNumber;
    private Integer money;
 }
