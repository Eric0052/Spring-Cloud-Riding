package com.riding.springcloud.service;

import com.riding.springcloud.entity.Bill;
import com.riding.springcloud.entity.CommonResult;
import com.riding.springcloud.entity.Driver;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface DriverService {
    int updateAvailable(Integer id, int value);
    Driver getDriverById(Integer id);

}
