package com.majr.crepe.dao.user;

import com.majr.crepe.entity.user.User;

import java.util.List;

public interface UserDAO {

    User getUserById(Long id);
    List<User> getManyUsers();
    User createNewUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);
}
