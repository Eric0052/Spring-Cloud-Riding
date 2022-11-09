package com.riding.springcloud.service;

import com.riding.springcloud.entity.Bill;
import com.riding.springcloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "CLOUD-BILL-SERVICE")
public interface DriverFeignService {
    @PutMapping(value = "/bill/{id}")
    public CommonResult updateArrivedOrPayed(@PathVariable("id") Integer id, @RequestBody Bill bill);
}
