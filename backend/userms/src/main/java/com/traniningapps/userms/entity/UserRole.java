package com.traniningapps.userms.entity;

import javax.persistence.*;

@Entity
public class UserRole {

    @GeneratedValue
    @Id
    private Long userRoleId;

    @ManyToOne
    private Role role;


    @ManyToOne(fetch = FetchType.EAGER)
    private User user;


    public UserRole() {

    }

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
