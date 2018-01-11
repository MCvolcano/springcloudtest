package com.example.controller;


/**
 * @Author：马灿
 * @Description:
 * @Date: 上午 9:28 2018-01-11
 */
public class StoryController {

    public static void main(String[] args) {
        System.out.println("测试用");
    }

    public String name = "zhangsan" ;

    private int age ;

    private String sex ;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
