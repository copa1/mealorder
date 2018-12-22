package com.copa.mealorder.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 12.22
 * 员工角色类型实体类
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    //角色类型id
    private int id;

    //角色类型名称
    private String name;
}
