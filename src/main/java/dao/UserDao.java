package dao;


import entity.User;

import java.util.List;

public interface UserDao {

    /**
     * 通过id查找单个用户
     * @param id 要查找的用户id
     * @return 查找到的用户信息
     */
    User getUserById(int id);

    /**
     * 查找所有用户
     * @return 用户集合
     */
    List<User> getUsers();

    /**
     * 更新用户信息
     * @param user  要更新的用户信息
     * @return  更新是否成功
     */
    boolean updateUser(User user);

    /**
     * 删除用户
     * @param id  要删除的用户id
     * @return 删除是否成功
     */
    boolean delUser(int id);

}
