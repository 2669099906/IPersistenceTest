package com.zxr.pojo;

/**
 * @author zhaoxiangrui
 * @date 2020/11/8 18:56
 */
public class User {

    private Integer id;

    private String username;

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + username + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }
}
