package com.khc.study.domain.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * User
 */
public class User {

    @Id
    @Column(name = "user_id")
    private String userId; 

    @Column(name = "name")
    private String name;

    @Column(name = "nickname")
    private String nickName;

    @Column(name = "level")
    private String level;

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public User userId(String userId) {
        this.userId = userId;
        return this;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

    public User nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public User level(String level) {
        this.level = level;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(userId, user.userId) && Objects.equals(name, user.name) && Objects.equals(nickName, user.nickName) && Objects.equals(level, user.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name, nickName, level);
    }

    @Override
    public String toString() {
        return "{" +
            " userId='" + getUserId() + "'" +
            ", name='" + getName() + "'" +
            ", nickName='" + getNickName() + "'" +
            ", level='" + getLevel() + "'" +
            "}";
    }

}