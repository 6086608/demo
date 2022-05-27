package com.example.springboot.demo1;

/**
 * @author liuyang
 * @version 1.0.0
 * @Description TODO
 * @date 2022/02/21 20:31
 */
public class StreamDemo1 {

//    public static void main(String[] args) {
//        String[] a = new String[] {"302","300"};
//        String[] b = new String[]{"315", "303", "310", "316", "314"};
//        System.arraycopy(a, 0, b, b.length, a.length-1);
//        for(int i=0;i<b.length;i++){
//            System.out.println(b[i]);
//        }
////        for(int i=0;i<a.length;i++){
////            System.out.println(a[i]);
////        }
//    }

    public static void main(String[] args) {
        char a1[] = {'a', 'b', 'c', 'd', 'e', 'f'}, b1[] = {'1', '2', '3', '4', '5', '6'};
        System.arraycopy(b1, 0, a1, 5, b1.length-1 );
        System.out.println(new String(a1));
        System.out.println(new String(b1));
    }
}
