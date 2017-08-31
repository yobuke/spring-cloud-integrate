/*
package com.hundsun.mapper;

import com.hundsun.model.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Insert("insert into t_user(name, age) values(#{name}, #{age})")
    void insertUser(User user);

    @Update("update t_user set name=#{name}, age=#{age} where id=#{id}")
    void updateUser(User user);

    @Select("select * from t_user where id=#{id}")
    User findById(int id);

    @Delete("delete from t_user where id=#{id}")
    void deleteUser(int id);
}
*/
