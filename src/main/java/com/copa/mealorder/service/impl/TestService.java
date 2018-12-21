package com.copa.mealorder.service.impl;

import com.copa.mealorder.model.TestEntity;
import com.copa.mealorder.repository.mybatis.TestReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 12.21
 * 测试service
 */

@Service
public class TestService {

    @Autowired
    private TestReposity reposity;

    public TestEntity testSerivce(){
        return reposity.get();
    }
}
