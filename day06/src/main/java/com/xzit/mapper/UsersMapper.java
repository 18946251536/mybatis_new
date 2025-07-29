package com.xzit.mapper;

import com.xzit.model.Users;

import java.time.LocalDateTime;
import java.util.List;

public interface UsersMapper {
    Users login(Users users);
    int updateTime(int uid);

}
