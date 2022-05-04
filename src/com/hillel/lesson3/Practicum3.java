package com.hillel.lesson3;

public class Practicum3 {
    public static void main(String[] args) {


        //|a-b|/(a+b)^3-c
      double a,b,c;
      a = 10;
      b = 20;
      c = 30;
      double result1 =  Math.abs(a-b)/ Math.pow(a+b,3) - Math.sqrt(c) ;
      System.out.println("result1 "+result1);
      // (a+b)/12 * c%4+|b|
      double result2 = (a+b)/12 * c%4+Math.abs(b);
      System.out.println("result2 "+result2);
      int konst = 12*10;
      double zp10year1 = konst*a;
      double zp10year2 = konst*b;
      double zp10year3 = konst*c;

       System.out.println("zp10year1 "+zp10year1);
       System.out.println("zp10year2 "+zp10year2);
       System.out.println("zp10year3 "+zp10year3);





    }
}
