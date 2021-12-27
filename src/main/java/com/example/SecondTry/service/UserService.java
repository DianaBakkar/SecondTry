package com.example.SecondTry.service;


import com.example.SecondTry.dao.UserDao;
import com.example.SecondTry.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserDao userDao;
    @Autowired

    public UserService(@Qualifier("fakeUserDao")UserDao userDao) {
        this.userDao = userDao;
    }

    public int insertUser(User user){
        return userDao.insertUser(user.getUsername(),user.getPassword(), user.getNumberOfPosts(), user);
    }

    public List<User> getAllUser(){return userDao.selectAllUser();}
    public int deleteUser(User user){return userDao.deleteUser(user);}


}

