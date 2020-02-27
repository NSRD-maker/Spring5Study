package com.kuang.demo04;

import com.kuang.demo02.UserSeiviceImpl;
import com.kuang.demo02.UserService;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserSeiviceImpl userService = new UserSeiviceImpl();
        //代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarget(userService);//设置要代理的对象
        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();

        proxy.add();
        proxy.delete();
    }
}
