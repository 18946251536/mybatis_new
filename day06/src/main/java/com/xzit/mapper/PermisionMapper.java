package com.xzit.mapper;

import com.xzit.model.Permision;
import com.xzit.model.Role;

import java.util.List;

public interface PermisionMapper {
    List<Permision> selectByRid(int[] rids);
}
