package dao;


import entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserDao {

    /**
     * 通过id查找单个用户
     * @param id 要查找的用户id
     * @return 查找到的用户信息
     */
    @Select("select * from user where id = #{id}")
    User getUserById(int id);

    /**
     * 查找所有用户
     * @return 用户集合
     */
    @Select("select * from user")
    List<User> getUsers();

    /**
     * 更新用户信息
     * @param user  要更新的用户信息
     * @return  更新是否成功
     */
    @Update("Update user set name = #{name} username = #{username}, password = #{password} where id = #{id}")
    boolean updateUser(User user);

    /**
     * 删除用户
     * @param id  要删除的用户id
     * @return 删除是否成功
     */
    @Update("update User set deleted where id = #{id}")
    boolean delUser(int id);

}
