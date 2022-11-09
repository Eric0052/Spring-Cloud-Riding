package com.riding.springcloud.controller;

import com.riding.springcloud.entity.Bill;
import com.riding.springcloud.entity.CommonResult;
import com.riding.springcloud.service.BillService;
import org.apache.ibatis.type.TypeAliasRegistry;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BillController {
    @Resource
    private BillService billService;

    //创建一个订单
    @PostMapping(value = "/bill")
    public CommonResult save(@RequestBody Bill bill){
        int result = billService.saveBill(bill);
        if(result>0){
            return new CommonResult(200,"插入数据库成功",result);
        }
        else{
            return new CommonResult(444,"插入失败",null);
        }
    }

    //确认订单已到目的地或者已付款
    @PutMapping(value = "/bill/{id}")
    public CommonResult updateArrivedOrPayed(@PathVariable("id") Integer id,@RequestBody Bill bill){
        if(bill.getArrived()!=null){
            int result = billService.updateArrived(id);
            if(result>0){
                return new CommonResult(200,"目的地已抵达",result);
            }
            else{
                return new CommonResult(444,"确认抵达失败",null);
            }
        }

        if(bill.getPayed()!=null){
            int result = billService.updatePayed(id);
            if(result>0){
                return new CommonResult(200,"订单已支付",result);
            }
            else{
                return new CommonResult(444,"支付失败",null);
            }
        }

        else{
            return new CommonResult(500,"错误的更改",null);
        }

    }

    //获取一个乘客的所有订单
    @GetMapping("/bill/{passengerId}")
    public CommonResult getBilldByPassengerId(@PathVariable("passengerId")Integer passengerId){
        List<Bill> billList = billService.getBillsByPassengerId(passengerId);
        return new CommonResult(200,"查询成功",billList);
    }
}
