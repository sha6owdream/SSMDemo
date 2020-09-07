package service.impl;

import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    public List<User> getAllUser() {
        return userDao.getUsers();
    }

    public boolean updateUser(User user) {
        return userDao.updateUser(user);
    }

    public boolean delUser(int id) {
        return userDao.delUser(id);
    }
}
