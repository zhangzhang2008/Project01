package com.tx;

import java.util.ArrayList;

public class HelloWorld {


    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        test();
        System.out.printf("");
        String[] arry = new String[]{"zs", "ls", "ww"};
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }

        for (String a : arry) {
            System.out.println(a);
        }

        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Object o : list) {
            System.out.println(o);
        }

        if (list == null) {

        }

        if (list != null) {

        }

        if (list == null) {

        }

        if (list != null) {

        }


    }

    private static void test() {
        System.out.print("Hello World!!!");
        ArrayList list = new ArrayList();
        System.out.println(0.05+0.01==0.06);
    }

    public String test1(int state, String str) {
        return "a";
    }
}
