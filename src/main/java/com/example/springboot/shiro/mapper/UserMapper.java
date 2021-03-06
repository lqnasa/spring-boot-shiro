package com.example.springboot.shiro.mapper;

import com.example.springboot.shiro.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

@Repository
public interface UserMapper extends Mapper<User>, MySqlMapper<User> {
    User findUserByUserName(String username);

    List<User> findAllUsers();

    List<User> findUsersByRoleId(Long roleId);

    List<User> findUsersByCondition(@Param("keywordType") Short keywordType, @Param("keyword") String keyword, @Param("status") Short status);

    void updateStatusById(@Param("id") Long id, @Param("status") Short status);
}
