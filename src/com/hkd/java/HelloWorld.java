package com.hkd.java;


import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {

        Date date1 = new Date();

        System.out.println(date1);

        System.out.println("ha1a1!!");
        System.out.println("ha1a1!!");

        System.out.println("ha1a1!!");
        System.out.println("ha1a1!!");
        ArrayList alist = new ArrayList();
        alist.add(0, "sw");
        System.out.println(alist);

        System.out.println();

        System.out.println();
        int num = 1;

        String arr[] = new String[]{"tom", "je"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }

        ArrayList li = new ArrayList();
        li.add(123);
        for (Object o : li) {

        }
        System.out.println("num = " + num);


    }

    public void method() {
        /*4 + 2 + ?=> 19;  5 + 8 + 6


                还需要6天 => 8+12+6,11+11+5,10+11+5,12+13,*/
    }
}
