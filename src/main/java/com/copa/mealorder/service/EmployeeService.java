package com.copa.mealorder.service;

/**
 * 12.22
 * employee业务操作
 */
public interface EmployeeService {

    /**
     * 更新最近登录时间
     * @param username 用户名
     * @param recentlyLanded 最近登录时间
     */
    void updateRecentlyLanded(String username, String recentlyLanded);

}
