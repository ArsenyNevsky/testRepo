package com.epam.batis.core;

import java.util.Collection;
import java.util.List;

//@Service
public class UserService {

    // do
    //@Autowired
    private UserMapper userMapper;

    public void createUser(User user) {

    }

    public void updateUser(User user) {

    }

    public boolean checkIfExists(String email) {
        return false;
    }

    public Collection<User> getAll() {
        List<User> users = userMapper.getAllUsers();

        return users;
    }

    public User getUserById(Integer id) {
        User user = userMapper.findUserById(id);

        return user;
    }

    public void deleteUser(Integer id) {

    }
}
