package com.riding.springcloud;


import org.apache.ibatis.type.TypeAliasRegistry;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class BillMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(BillMain8001.class,args);
    }

}
