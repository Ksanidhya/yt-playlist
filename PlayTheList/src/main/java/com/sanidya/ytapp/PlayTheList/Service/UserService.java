package com.sanidya.ytapp.PlayTheList.Service;

import com.sanidya.ytapp.PlayTheList.Entity.User;

import java.util.List;

public interface UserService {

    public User getUserDetailByID(Long id);

    public User addUser(User user);

    public List<User> getUsers();
}
