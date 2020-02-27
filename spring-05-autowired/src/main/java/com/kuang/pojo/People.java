package com.kuang.pojo;

//import jdk.internal.jline.internal.Nullable;
import org.springframework.beans.factory.annotation.Autowired;

public class People {

    @Autowired
    private Dog dog;
    @Autowired
    private Cat cat;
    private String name;

    //    public People(@Nullable String name){
    public People(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }
}
