package com.xzit.service;

import com.xzit.mapper.TeacherMapper;
import com.xzit.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService {


    public static void insertTeacher(TeacherMapper mapper){
        Scanner sc = new Scanner(System.in);
        List<Teacher> list = new ArrayList<Teacher>();
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
            list.add(new Teacher(0,name,addr,age,job,sal));

        }
        mapper.insert(list);
    }

    public static void selectByCity(TeacherMapper mapper){
        List<Teacher> list= mapper.selectByCity("成都市");
        list.forEach(System.out::println);
    }

    public static void sumSal(TeacherMapper mapper){
        System.out.println(mapper.sumSalByCity("吉林省"));
    }

    public static void update(TeacherMapper mapper){
        Teacher teacher = new Teacher();
        teacher.setAddr("吉林市");
        teacher.setName("刘七");
        teacher.setSal(10000);
        teacher.setJob("销售经理");
        System.out.println(mapper.update(teacher)>0?"更新成功":"更新失败");
    }

    public static void deleteById(TeacherMapper mapper){
        int[] ids={9,11,12};
        System.out.println(mapper.delete(ids)>0?"删除成功":"删除失败");
    }
}
