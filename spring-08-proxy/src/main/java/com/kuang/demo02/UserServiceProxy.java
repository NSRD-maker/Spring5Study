package com.kuang.demo02;

public class UserServiceProxy implements UserService {

    private UserSeiviceImpl userSeivice;

    public void setUserSeivice(UserSeiviceImpl userSeivice){
        this.userSeivice = userSeivice;
    }

    @Override
    public void add() {
        log("add");
        userSeivice.add();
    }

    @Override
    public void delete() {
        log("delete");
        userSeivice.delete();
    }

    @Override
    public void update() {
        log("update");
        userSeivice.update();
    }

    @Override
    public void query() {
        log("query");
        userSeivice.query();
    }

    //日志方法
    public void log(String msg){
        System.out.println("[Debug]使用了"+msg+"方法");
    }
}
