package com.xzit.controller;

import com.xzit.mapper.PermisionMapper;
import com.xzit.mapper.UsersMapper;
import com.xzit.model.Permision;
import com.xzit.model.Role;
import com.xzit.model.Users;
import com.xzit.sevice.RoleService;
import com.xzit.sevice.UsersService;
import com.xzit.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Scanner;

public class Controller {
    public static void  show() {
        SqlSession session = SessionUtil.getSession(true);
        UsersMapper usersMapper = session.getMapper(UsersMapper.class);
        PermisionMapper permisionMapper = session.getMapper(PermisionMapper.class);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.next();
        System.out.println("请输入密码：");
        String password = scanner.next();
        Users user = UsersService.login(username, password, usersMapper);
        if(user == null) {
            System.out.println("当前用户不存在");
        }else{
            System.out.println(user.getUname()+"登录系统");
            System.out.println("角色是：");
            int[] rids=new int[user.getRoles().size()];
            int i=0;
            for (Role role : user.getRoles()) {
                System.out.println("\t\t"+role.getRname());
                rids[i]=role.getRid();
                ++i;
            }
            List<Permision> permisions = RoleService.selectByRid(rids,permisionMapper);
            System.out.println("可操作菜单有");
            for (Permision permision : permisions) {
                System.out.println("<a href='"+permision.getUrl()+"'>"+permision.getPname()+"</a>");
            }
            UsersService.updateTime(user.getUid(),usersMapper);
        }
        session.close();
    }
}
