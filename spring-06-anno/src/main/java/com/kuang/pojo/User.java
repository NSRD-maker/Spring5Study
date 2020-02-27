package com.kuang.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.kuang.pojo.User"/>
//@Component 组件
@Component
@Scope("singleton")
public class User {
    //相当于<property name="name" value="小憨批"/>
    public String name;
    @Value("小憨批")
    public void setName(String name){
        this.name = name;
    }
}
