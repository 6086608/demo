package com.example.springboot.demo1;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author liuyang
 * @version 1.0.0
 * @Description TODO
 * @date 2022/02/07 11:06
 */
public class demo3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 34, 5};

        new Thread(() ->{
            System.out.println("1");
        }).start();
        Stream<int[]> stream2 = Stream.of(arr, arr);
        stream2.forEach(e -> {
            System.out.println(Arrays.toString(e));
        });
        stream2.forEach(System.out::println);
    }
}
