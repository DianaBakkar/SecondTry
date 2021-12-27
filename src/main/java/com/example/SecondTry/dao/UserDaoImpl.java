package com.example.SecondTry.dao;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeUserDao")
public class UserDaoImpl implements UserDao{
    private static List<User> DB=new ArrayList<>();
    @Override
    public int insertUser(String username,String password, int valid,int Id, User user) {
        DB.add(new User(user.getUsername(),user.getPassword()),use);
        return 1;
    }

    @Override
    public List<User> selectAllUser() {
        return DB;
    }
    @Override
    public int deleteUser( User user) {
        DB.remove(user);
        return 1;
    }
}
