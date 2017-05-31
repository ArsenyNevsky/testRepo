package com.epam.batis.core;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface UserMapper {

    // comment
    @Insert("INSERT INTO User(firstname, middlename, lastname, email, password, birthday) " +
            "VALUES(#{firstname}, #{middlename}, #{lastname}, #{email}, #{password}, #{birthday})")
    @Options(useGeneratedKeys = true)
    void createUser(User user);

    @Select("SELECT * FROM User")
    List<User> getAllUsers();

    @Select("SELECT * FROM User u WHERE u.id = #{id}")
    User findUserById(Integer id);
}
