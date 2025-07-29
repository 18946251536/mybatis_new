package com.xzit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Permission;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private int rid;
    private String rname;
    private List<Users> users;
    private List<Permission> permissions;
}
