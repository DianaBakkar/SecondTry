package com.example.SecondTry.dao;




import org.apache.tomcat.jni.User;

import java.util.List;

public interface UserDao {
    int insertUser(String username,String password, int valid,int Id, User user);

    List<User> selectAllUser();
    int deleteUser(User user);

}
