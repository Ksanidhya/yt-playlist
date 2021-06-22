package com.sanidya.ytapp.PlayTheList.Service;

import com.sanidya.ytapp.PlayTheList.Entity.User;
import com.sanidya.ytapp.PlayTheList.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getUsers(){
        return userRepository.findAll();
    }
    @Override
    public User getUserDetailByID(Long id){
        return  userRepository.findByUserId(id).get();
    }

    @Override
    public User addUser(User user){
        return userRepository.save(user);
    }
}
