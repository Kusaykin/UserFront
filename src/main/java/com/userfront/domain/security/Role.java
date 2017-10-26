package com.userfront.domain.security;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;



@Entity
public class Role {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roleId;

    private String name;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<com.userfront.domain.security.UserRole> userRoles = new HashSet<>();

    public Role() {

    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<com.userfront.domain.security.UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<com.userfront.domain.security.UserRole> userRoles) {
        this.userRoles = userRoles;
    }


}