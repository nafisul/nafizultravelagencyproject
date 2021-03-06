package com.bs23.travelagency.repository;

import com.bs23.travelagency.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nafizul.islam on 9/27/2020.
 */

    public interface UserRepository extends JpaRepository<User, Long> {
        User findByEmail(String email);

}
