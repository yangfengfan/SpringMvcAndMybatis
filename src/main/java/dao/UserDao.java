package dao;

import entity.User;

/**
 * Dao接口，用来对应mapper文件
 */
public interface UserDao {
    public User selectUserById(Integer UserId);
}
