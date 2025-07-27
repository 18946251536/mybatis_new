package com.xzit;

import com.xzit.model.Teacher;
import com.xzit.service.TeacherService;
import com.xzit.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        SqlSession session = SessionUtil.getSession(true);
//        TeacherService.insertTeacher(session);
//        System.out.println(TeacherService.selectTeacher(session));
//        System.out.println(TeacherService.avgSal(session));
//        TeacherService.updateTeacher(session);
        TeacherService.deleteTeacher(session);
        session.commit();
    }
}
