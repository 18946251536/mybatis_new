package com.xzit.sevice;

import com.xzit.mapper.PermisionMapper;
import com.xzit.model.Permision;
import com.xzit.model.Role;

import java.util.List;

public class RoleService {
    public static List<Permision> selectByRid(int[] rids, PermisionMapper mapper) {
        return mapper.selectByRid(rids);
    }
}
