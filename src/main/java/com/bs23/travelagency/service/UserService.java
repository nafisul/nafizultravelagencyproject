package com.bs23.travelagency.service;

import com.bs23.travelagency.entity.User;

/**
 * Created by nafizul.islam on 9/26/2020.
 */
public interface UserService {
    void save(User user);
    User findByEmail(String email);
}
