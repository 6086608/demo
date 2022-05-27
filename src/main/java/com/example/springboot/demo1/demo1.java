package com.example.springboot.demo1;

import lombok.Data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author liuyang
 * @version 1.0.0
 * @Description TODO
 * @date 2022/01/29 10:54
 */
public class demo1 {

    private static Map<String, Consumer<String>> FUNC_MAP = new ConcurrentHashMap<>();
    private static String MAN = "man";
    private static String WOMAN = "woman";
    static {
        FUNC_MAP.put(MAN,  s ->{System.out.println(s + "应该去男厕所");});
        FUNC_MAP.put(WOMAN,s ->{System.out.println(s + "应该去女厕所");});
    }

    @Data
    static class Person{
        private String gender;
        private String name;
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.setGender(MAN);
        p.setName("张三");
        Person p2 = new Person();
        p2.setGender(WOMAN);
        p2.setName("张三他老婆");


        FUNC_MAP.get(p.getGender()).accept(p.name);
        FUNC_MAP.get(p2.getGender()).accept(p2.name);

    }
}
