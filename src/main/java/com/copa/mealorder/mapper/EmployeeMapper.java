package com.copa.mealorder.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * 12.22
 * employee表操作
 */
@Mapper
@Repository
public interface EmployeeMapper {

    @Select("select count(*) from employee where username=#{username}")
    public boolean isExistEmployeeByUsername(@Param("username") String username);

    @Update("update employee set recentlyLanded=#{recentlyLanded} where username=#{username}")
    public void updateRecentlyLandedByUsername(@Param("username") String username,@Param("recentlyLanded") String recentlyLanded);
}
