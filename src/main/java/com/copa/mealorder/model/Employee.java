package com.copa.mealorder.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 12.22
 * 员工实体类
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    //员工id
    private int id;

    //员工的用户名
    private String username;

    //员工密码
    private String password;

    //员工电话
    private String phone;

    //员工性别
    private String gender;

    //员工电子邮箱
    private String email;

    //员工姓名
    private String realName;

    //员工头像
    private String avatar;

    //员工最后一次登录时间
    private String recentlyLanded;

    //员工所包含的角色
    private List<Role> roles;
}
