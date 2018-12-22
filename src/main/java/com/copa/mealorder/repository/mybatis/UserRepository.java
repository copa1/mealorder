package com.copa.mealorder.repository.mybatis;

import com.copa.mealorder.model.Employee;
import org.springframework.stereotype.Repository;

/**
 * 12.22
 * xml配置Employee表操作
 */

@Repository
public interface UserRepository {

    /**
     * 通过用户名查找员工
     * @param username 用户名
     * @return 员工
     */
    Employee findByUsername(String username);
}
