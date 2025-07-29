package com.xzit.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xzit.mapper.mybatis.TeacherMapper;
import com.xzit.model.mybatis.Teacher;
import com.xzit.model.mybatis.TeacherExample;

import java.util.List;
import java.util.Scanner;

public class TeacherService {
    public static void insert(TeacherMapper mapper){
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
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
            mapper.insertSelective(new Teacher().setName(name).setAddr(addr).setAge(age).setJob(job).setSal(sal));
        }
    }
    public static void select(TeacherMapper mapper){
        PageHelper.startPage(1, 3);
        TeacherExample example = new TeacherExample();
        List<Teacher> teachers = mapper.selectByExample(example);
        PageInfo<Teacher> pageInfo = new PageInfo<Teacher>(teachers);
        List<Teacher> list = pageInfo.getList();
        list.forEach(System.out::println);
    }
    public static void delete(TeacherMapper mapper){
        TeacherExample example = new TeacherExample();
        example.createCriteria().andAddrLike("陕西省%");
        System.out.println(mapper.deleteByExample(example)>0?"删除成功":"删除失败");
    }
    public static void updateByAge(TeacherMapper mapper){
        TeacherExample example = new TeacherExample();
        example.createCriteria().andAgeGreaterThan(27);
        for (Teacher teacher : mapper.selectByExample(example)) {
            teacher.setSal(teacher.getSal()+1000);
            teacher.setId(teacher.getId());
            mapper.updateByPrimaryKeySelective(teacher);
        }
    }
}
