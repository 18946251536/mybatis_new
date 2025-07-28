package com.xzit;

import com.xzit.mapper.TeacherMapper;
import com.xzit.service.TeacherService;
import com.xzit.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;

public class Test {
    public static void main(String[] args) {
        SqlSession session = SessionUtil.getSession(true);
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
//        TeacherService.insertTeacher(mapper);
//        TeacherService.selectByCity(mapper);
//        TeacherService.sumSal(mapper);
//        TeacherService.update(mapper);
        TeacherService.deleteById(mapper);
    }
}
