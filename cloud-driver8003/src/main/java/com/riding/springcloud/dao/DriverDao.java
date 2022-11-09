package com.riding.springcloud.dao;

import com.riding.springcloud.entity.Driver;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DriverDao {
    int updateAvailable(@Param("id")Integer id, @Param("value")int value);

    Driver getDriverById(@Param("id") Integer id);
}
