package com.hillel.lesson3;

public class MathOperation {
    public static void main(String[] args) {
        Integer a = new Integer("45");
        int b = 56;
        int c = a++;
        int l = b--;

        System.out.println("c = "+c);
        System.out.println("a = "+a);
        System.out.println("l = "+l);
        double  d= 456.456;
        int v = (int) d;

        String s = "d = ";
        System.out.println(s+d);
        double x = 456.0 + d;
        System.out.println(x);
        System.out.println("v = "+v);

        System.out.println("b = "+b);
        System.out.println("c = "+b);

        int result = ++a+ b-- + ++c;
        System.out.println("result = "+result);
        int g=15%4;
        System.out.println("Остача від ділення " +g);

    }
}
