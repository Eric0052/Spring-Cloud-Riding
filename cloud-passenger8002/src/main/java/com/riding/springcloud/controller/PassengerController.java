package com.riding.springcloud.controller;

import com.riding.springcloud.entity.Bill;
import com.riding.springcloud.entity.CommonResult;
import com.riding.springcloud.entity.Driver;
import com.riding.springcloud.service.PassengerFeignService;
import com.riding.springcloud.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PassengerController {
    @Autowired
    private PassengerService passengerService;
    @Autowired
    private PassengerFeignService passengerFeignService;

    @GetMapping("/passenger/available")
    public CommonResult<List<Driver>> get() {
        return new CommonResult<>(200, "success", passengerService.getAvailableDrivers());
    }

    @PutMapping("/passenger/bill/{billId}")
    public CommonResult ConfirmPayed(@PathVariable("billId") Integer billId){
        Bill bill = new Bill(null,null,null,null,null,1);
        CommonResult commonResult =  passengerFeignService.updateArrivedOrPayed(billId,bill);

        Integer result = passengerService.payBill(billId);
        if(result<=0){
            return new CommonResult(444,"支付失败",null);
        }
        else{
            return commonResult;
        }
    }

    @PostMapping("/passenger/bill")
    public CommonResult CreatBill(@RequestBody Bill bill){
        return passengerFeignService.save(bill);
    }

}
