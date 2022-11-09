package com.riding.springcloud.service.impl;


import com.riding.springcloud.dao.BillDao;
import com.riding.springcloud.entity.Bill;
import com.riding.springcloud.service.BillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BillServiceImpl implements BillService {

    @Resource
    private BillDao billDao;

    @Override
    public int saveBill(Bill bill){
        return billDao.saveBill(bill);
    }

    @Override
    public int updateArrived(Integer id){return billDao.updateArrived(id);}

    @Override
    public int updatePayed(Integer id){return billDao.updatePayed(id);}

    @Override
    public List<Bill> getBillsByPassengerId(Integer passengerId){return billDao.getBillsByPassengerId(passengerId);}

}
