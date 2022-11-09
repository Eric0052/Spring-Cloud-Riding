package com.riding.springcloud.dao;

import com.riding.springcloud.entity.Bill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface BillDao {

    //新建订单
    int saveBill(Bill bill);

    //获取某乘客所有订单
    List<Bill> getBillsByPassengerId(@Param("id")Integer passengerId);

//    //获取某司机所有订单
//    public List<Bill> getBillsByDriverId(Integer driverId);
//
    //更改订单为送达状态
    int updateArrived(@Param("billId") Integer id);

    //更改订单的支付状态
    int updatePayed(@Param("billId") Integer id);

    //


}
