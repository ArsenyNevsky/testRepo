package com.epam.batis.core;

import java.util.Collection;
import java.util.List;

//@Service
public class UserService {

    //@Autowired
    private UserMapper userMapper;

    public Collection<User> getAll() {
        List<User> users = userMapper.getAllUsers();

        return users;
    }

    public User getUserById(Integer id) {
        User user = userMapper.findUserById(id);

        return user;
    }
}
