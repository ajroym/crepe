package com.majr.crepe.service.user;

import com.majr.crepe.entity.user.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    public UserServiceImpl() { }


    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public List<User> getManyUsers() {
        return null;
    }

    @Override
    public User createNewUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
