package com.xzit.mapper;

import com.xzit.model.Teacher;

import java.util.List;

public interface TeacherMapper {
    void insert(List<Teacher> list);
    List<Teacher> selectByCity(String city);
    int sumSalByCity(String province);
    int update(Teacher teacher);
    int delete(int[] ids);
}
