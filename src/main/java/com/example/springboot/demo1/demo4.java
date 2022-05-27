package com.example.springboot.demo1;

import lombok.Data;

import java.util.function.Consumer;

/**
 * @author liuyang
 * @version 1.0.0
 * @Description TODO
 * @date 2022/02/16 21:13
 */
public class demo4 {

    private static String MAN = "man";
    private static String WOMAN = "woman";
    public static void main(String[] args) {
        Person p = new Person();
        p.setGender(MAN);
        p.setName("张三");
        demo1.Person p2 = new demo1.Person();
        p2.setGender(WOMAN);
        p2.setName("张三他老婆");
        getString(p,(s) -> {
            System.out.println(s + "应该去男厕所");
        });
    }



    @Data
    static class Person{
        private String gender;
        private String name;
    }

    public static void getString(Person person,Consumer<String> p1) {
         p1.accept(person.getName());
    }
}
