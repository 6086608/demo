package com.example.springboot.demo1;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author liuyang
 * @version 1.0.0
 * @Description TODO
 * @date 2022/01/29 11:06
 */
public class demo2 {
    public static void main(String[] args) {
        test(s -> {
            System.out.println(s);
        });

    }

    private static void test(Consumer<String> ss) {
        ss.accept("eee");
    }

}
