package com.xzit.mapper;

import com.xzit.model.Teacher;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> selectAll();
    void insert(Teacher t);
    int avgSal(String addr);
    void updateJob(Teacher t);
    void delete(int age);
}
