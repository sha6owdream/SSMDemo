package service;

import entity.User;

import java.util.List;

public interface UserService {


    /**
     * 查询单个用户
     * @param id 用户id
     * @return 用户信息
     */
    public User getUserById(int id);

    /**
     * 查询所有用户
     * @return 用户集合
     */
    public List<User> getAllUser();

    /**
     * 更新用火狐信息
     * @param user 要更新的用户信息
     * @return  更新是否成功
     */
    public boolean updateUser(User user);

    /**
     * 根据id删除用户
     * @param id  要删除的用户id
     * @return  删除是否成功
     */
    public boolean delUser(int id);

}
