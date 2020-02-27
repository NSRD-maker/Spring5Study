package com.kuang.demo02;

public class Client {
    public static void main(String[] args) {
        UserSeiviceImpl userSeivice = new UserSeiviceImpl();

        UserServiceProxy proxy =  new UserServiceProxy();
        proxy.setUserSeivice(userSeivice);

        proxy.add();
    }
}
