package com.userfront.service;

import com.userfront.domain.User;
import com.userfront.domain.security.UserRole;

import java.util.List;
import java.util.Set;

public interface UserService {

    void save (User user);

    User createUser(User user, Set<UserRole> userRoles);

    User findByUsername(String username);

    User findByEmail(String email);

    boolean checkUserExists(String username, String email);

    boolean checkUsernameExists(String username);

    boolean checkEmailExists(String email);

    User saveUser(User user);

    List<User> findUserList();

    void enableUser (String username);

    void disableUser (String username);

}
