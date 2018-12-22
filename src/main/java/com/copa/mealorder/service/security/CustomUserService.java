package com.copa.mealorder.service.security;

import com.copa.mealorder.model.Employee;
import com.copa.mealorder.model.Role;
import com.copa.mealorder.repository.mybatis.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * 12.22
 * 用户登录处理
 */

public class CustomUserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //根据用户名从数据库查询对应记录
        Employee employee=userRepository.findByUsername(username);
        if (employee == null){
            return (UserDetails) new UsernameNotFoundException("该员工不存在！");
        }

        List<SimpleGrantedAuthority> authorities=new ArrayList<>();

        for (Role role : employee.getRoles()){
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }

        System.out.println("员工登录成功");
        return new User(employee.getUsername(),employee.getPassword(),authorities);
    }
}
