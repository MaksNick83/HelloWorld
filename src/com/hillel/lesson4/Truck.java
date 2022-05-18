package com.hillel.lesson4;

public class Truck {
    public static void main(String[] args) {
       String type ="Jet";
       String name ="F52";
       int firstClassPassengers = 20;
       int secondClassPassengers = 20;
       buildAirplane(type,name);
       buildAirplane("Boeing","747",300);
       buildAirplane("Boeing","747",300,25);

    }

    private static void buildAirplane(String type, String name) {
        System.out.println(type+" "+name);
    }
    private static void buildAirplane(String type, String name,int kol) {
        System.out.println(type+" "+name+" "+kol);
    }
    private static void buildAirplane(String type, String name,int kol,int first) {
        System.out.println(type+" "+name+" "+kol+" "+first);
    }
}
