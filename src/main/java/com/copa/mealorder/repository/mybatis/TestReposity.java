package com.copa.mealorder.repository.mybatis;

import com.copa.mealorder.model.TestEntity;
import org.springframework.stereotype.Repository;

/**
 * 12.21
 * 测试mapper的xml版本
 */

@Repository
public interface TestReposity {

    public TestEntity get();
}
