package com.riding.springcloud.service.impl;

import com.riding.springcloud.dao.DriverDao;
import com.riding.springcloud.entity.Driver;
import com.riding.springcloud.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverDao driverDao;


    @Override
    public int updateAvailable(Integer id, int value) {
        return driverDao.updateAvailable(id, value);
    }

    @Override
    public Driver getDriverById(Integer id){return driverDao.getDriverById(id);}
}
