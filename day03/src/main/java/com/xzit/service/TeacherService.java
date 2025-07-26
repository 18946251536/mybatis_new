package com.xzit.service;

import com.xzit.mapper.TeacherMapper;
import com.xzit.model.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.Scanner;

public class TeacherService {
    public static void selectTeacher(TeacherMapper mapper){
        mapper.selectAll().forEach(System.out::println);
    }

    public static void insertTeacher(TeacherMapper mapper){
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 6; i++) {
            System.out.println("请输入第"+i+"的数据");
            System.out.println("请输入姓名：");
            String name = sc.next();
            System.out.println("请输入地址：");
            String addr= sc.next();
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            System.out.println("请输入工作：");
            String job = sc.next();
            System.out.println("请输入工资：");
            int sal = sc.nextInt();
            mapper.insert(new Teacher(0,name, addr, age, job, sal));

        }
    }

    public static int avgSal(TeacherMapper mapper){
        return mapper.avgSal("吉林省");
    }

    public static void updateTeacher(TeacherMapper mapper){
        Teacher teacher = new Teacher();
        teacher.setAge(30);
        teacher.setJob("销售员");
        mapper.updateJob(teacher);
    }

    public static void deleteTeacher(TeacherMapper mapper){
        mapper.delete(35);
        System.out.println("删除成功");
    }
}
