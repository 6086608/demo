package com.example.springboot.demo1;

import com.example.springboot.common.User;

import java.util.Map;
import java.util.Optional;

/**
 * @author liuyang
 * @version 1.0.0
 * @Description TODO
 * @date 2022/01/17 14:26
 */
public class OptionalTest {

    public static void main(String[] args) {
        User user = new User();
        if(Optional.ofNullable(user).isPresent()) {
            System.out.println("不为空");
        }else {
            System.out.println("为空");
        }
    }
}
