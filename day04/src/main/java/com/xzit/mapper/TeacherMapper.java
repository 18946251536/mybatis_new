package com.xzit.mapper;

import com.xzit.model.Teacher;
import lombok.Data;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TeacherMapper {
    @Select("select * from teacher")
    List<Teacher> selectAll();

    @Insert("insert into teacher values (null,#{name},#{addr},#{age},#{job},#{sal})")
    void insert(Teacher t);

    @Select("select avg(sal) from teacher where addr like '${吉林省}%'")
    int avgSal(String addr);

    @Update("update teacher set job='销售经理' where age>#{age} and job=#{job}")
    void updateJob(Teacher t);

    @Delete("delete from teacher where age>#{age}")
    void delete(int age);
}
