package com.riding.springcloud.dao;

import com.riding.springcloud.entity.Bill;
import com.riding.springcloud.entity.Driver;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PassengerDao {
    List<Driver> getAvailableDrivers();
    int updateMoneyByPassengerId(@Param("passengerId") Integer passengerId,@Param("money")Integer money);
    int updateMoneyByDriverId(@Param("driverId") Integer driverId,@Param("money")Integer money);
    Bill getBillById(@Param("billId")Integer billId);
}
