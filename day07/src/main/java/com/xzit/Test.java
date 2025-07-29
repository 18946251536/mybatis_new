package com.xzit;

import com.mysql.cj.xdevapi.SessionFactory;
import com.xzit.mapper.mybatis.TeacherMapper;
import com.xzit.service.TeacherService;
import com.xzit.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;

public class Test {
    public static void main(String[] args) {
        SqlSession session = SessionUtil.getSession(true);
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
//        TeacherService.insert(mapper);
        TeacherService.select(mapper);
//        TeacherService.delete(mapper);
//        TeacherService.updateByAge(mapper);
        session.close();
    }
}
