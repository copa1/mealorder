package com.copa.mealorder.service.impl;

import com.copa.mealorder.mapper.EmployeeMapper;
import com.copa.mealorder.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 12.22
 * employee业务处理实现
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    //修改员工最近登录时间
    @Override
    public void updateRecentlyLanded(String username, String recentlyLanded) {
        boolean b=employeeMapper.isExistEmployeeByUsername(username);
        if (!b){
            return;
        }
        else {
            employeeMapper.updateRecentlyLandedByUsername(username,recentlyLanded);
        }
    }
}
