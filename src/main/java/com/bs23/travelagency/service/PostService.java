package com.bs23.travelagency.service;

import com.bs23.travelagency.dto.StatusDTO;
import com.bs23.travelagency.dto.UserPostDTO;
import com.bs23.travelagency.entity.Status;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by nafizul.islam on 9/26/2020.
 */
public interface PostService {
    List<StatusDTO> findByUserEmail(String email);
    public void save(UserPostDTO userPostDTO, HttpServletRequest request);
    public Status findById(Long postId);
    public void updatePost(StatusDTO statusDTO, HttpServletRequest request);
    public void updatePrivacy(StatusDTO statusDTO, HttpServletRequest request);
    public List<StatusDTO> getAllPublicPost(HttpServletRequest request);
}
