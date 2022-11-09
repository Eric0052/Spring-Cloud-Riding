package com.riding.springcloud.service.impl;

import com.riding.springcloud.dao.PassengerDao;
import com.riding.springcloud.entity.Bill;
import com.riding.springcloud.entity.Driver;
import com.riding.springcloud.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService {

    @Autowired
    private PassengerDao passengerDao;


    @Override
    public List<Driver> getAvailableDrivers() {
        return passengerDao.getAvailableDrivers();
    }

    @Override
    public int payBill(Integer billId){
        Bill bill = passengerDao.getBillById(billId);


        Integer result1 = passengerDao.updateMoneyByPassengerId(bill.getPassengerId(),bill.getPrice());
        Integer result2 = passengerDao.updateMoneyByDriverId(bill.getDriverId(),bill.getPrice());
        System.out.println("result1="+result1);
        System.out.println("result2="+result2);
        if(result1>0&&result2>0){
            return 1;
        }
        return 0;
    }
}
