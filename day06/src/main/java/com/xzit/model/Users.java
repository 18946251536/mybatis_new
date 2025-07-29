package com.xzit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private int uid;
    private String uname;
    private String pwd;
    private LocalDateTime lasttime;
    private List<Role> roles;
}
