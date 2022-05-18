package com.hillel.lesson4;

public class Methods {
    public static void main(String[] args) {
        System.out.println("before");
        String name = "Андрий";
        String jack = "Андрий";
        hello(name);
        hello("Vas");
        String hello = contact("wwwww", "eeeee");
        System.out.println(hello);
    }

    public static void hello(String name) {
        System.out.println("Hello" + name);
    }

    public static void hello(int age) {
        System.out.println("Hello" + age);
    }

    public static String contact(String str, String str2) {
        String s = str + " " + str2;
        return s;
    }

}

