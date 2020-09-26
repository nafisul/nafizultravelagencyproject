package com.bs23.travelagency.dto;

/**
 * Created by nafizul.islam on 9/26/2020.
 */
public class UserPostDTO {

    private String post;
    private Long location;
    private Integer postPrivacy;

    public UserPostDTO(){}

    public UserPostDTO(String post, Long location, Integer postPrivacy) {
        this.post = post;
        this.location = location;
        this.postPrivacy = postPrivacy;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Long getLocation() {
        return location;
    }

    public void setLocation(Long location) {
        this.location = location;
    }

    public Integer getPostPrivacy() {
        return postPrivacy;
    }

    public void setPostPrivacy(Integer postPrivacy) {
        this.postPrivacy = postPrivacy;
    }
}
