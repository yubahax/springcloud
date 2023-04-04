package com.example.service.serviceImpl;

import com.example.config.ThreadConfig;
import com.example.entity.User;
import com.example.mapper.UMapper;

import com.example.service.MyServcie;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.Future;

@Service
public class MyServiceImpl implements MyServcie {
    private static Logger logger = LogManager.getLogger(ThreadConfig.class.getName());
    @Resource
    UMapper mapper;
    @Override
    @Async
    public Future<List<User>> getAllAsync() {
        long startTime = System.currentTimeMillis();
        List<User> users = mapper.getUsers();
        long endTime = System.currentTimeMillis();
        System.out.println("执行时间：" + (endTime - startTime) + " ms");
        return AsyncResult.forValue(users);
//        return AsyncResult.forValue(userMapper.getUsers());
    }

    @Override
    public List<User> getAll() {
        long startTime = System.currentTimeMillis();
        List<User> users = mapper.getUsers();
        long endTime = System.currentTimeMillis();
        System.out.println("执行时间：" + (endTime - startTime) + " ms");
        return users;
    }
}
