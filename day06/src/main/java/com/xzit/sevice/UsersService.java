package com.xzit.sevice;

import com.xzit.mapper.UsersMapper;
import com.xzit.model.Role;
import com.xzit.model.Users;

import java.time.LocalDateTime;

public class UsersService {
    public static Users login(String uname, String pwd, UsersMapper mapper) {
        Users u = new Users();
        u.setUname(uname);
        u.setPwd(pwd);
        return mapper.login(u);

    }
    public static void updateTime(int uid,UsersMapper mapper) {
        mapper.updateTime(uid);
    }
}
