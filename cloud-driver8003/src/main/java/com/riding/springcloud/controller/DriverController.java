package com.riding.springcloud.controller;

import com.riding.springcloud.entity.Bill;
import com.riding.springcloud.entity.CommonResult;
import com.riding.springcloud.entity.Driver;
import com.riding.springcloud.service.DriverFeignService;
import com.riding.springcloud.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriverController {
    @Autowired
    private DriverService driverService;
    @Autowired
    private DriverFeignService driverFeignService;

    @PutMapping("/driver/{id}")
    public CommonResult<List<Driver>> setAvailable(@PathVariable("id")Integer id, @RequestBody Driver driver) {
        Integer value = driver.getAvailable();
        int result = driverService.updateAvailable(id, value);
        if(result>0){
            return new CommonResult(200,"状态设置成功",result);
        }
        else{
            return new CommonResult(444,"插入失败",null);
        }
    }


    @GetMapping("/driver/{id}")
    public CommonResult  getDriverById(@PathVariable("id") Integer id){
        Driver driver = driverService.getDriverById(id);
        if(driver!=null){
            return new CommonResult(200,"获取成功",driver);
        }
        else{
            return new CommonResult(444,"获取失败",null);
        }
    }

    @PutMapping("/driver/bill/{billId}")
    public CommonResult ConfirmArrived(@PathVariable("billId") Integer billId){
        Bill bill = new Bill(null,null,null,null,1,null);
        return driverFeignService.updateArrivedOrPayed(billId,bill);
    }

}
