package com.riding.springcloud.service;

import com.riding.springcloud.entity.Driver;

import java.util.List;

public interface PassengerService {
    List<Driver> getAvailableDrivers();
    int payBill(Integer billId);
}
