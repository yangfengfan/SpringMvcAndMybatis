package service;

import entity.User;

/**
 * service的接口
 */
public interface UserService {
    User selectUserById(Integer UserId);
}
