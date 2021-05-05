package com.tx;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

    public static void main(String[] args) {

        test();
        String[] arry = new String[]{"zs", "ls", "ww"};
        for (String a : arry) {
            System.out.println(a);
        }

        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Object o : list) {
            System.out.println(o);
        }
    }

    private static void test() {
        System.out.print("Hello World!!!");
        System.out.println(0.05+0.01==0.06);
    }
}
