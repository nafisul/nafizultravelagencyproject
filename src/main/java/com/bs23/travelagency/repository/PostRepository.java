package com.bs23.travelagency.repository;

import com.bs23.travelagency.entity.Status;
import com.bs23.travelagency.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by nafizul.islam on 9/27/2020.
 */
    public interface PostRepository extends JpaRepository<Status,Long> {
        List<Status> findByUserEmail(String email);

        @Query(value = "SELECT u FROM Status u WHERE u.postPrivacy = 0 AND u.user = :user")
        List<Status> findByUserWithPrivate(@Param("user") User user);

        @Query(value = "SELECT u FROM Status u WHERE u.postPrivacy = 1")
        List<Status> getAllPublicPost();
    }
