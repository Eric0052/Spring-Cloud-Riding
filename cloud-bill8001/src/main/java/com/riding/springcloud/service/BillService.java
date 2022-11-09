package com.riding.springcloud.service;

import com.riding.springcloud.entity.Bill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillService {
    public int saveBill(Bill bill);
    public int updateArrived(Integer id);
    public int updatePayed(Integer id);
    public List<Bill> getBillsByPassengerId(Integer passengerId);
}
