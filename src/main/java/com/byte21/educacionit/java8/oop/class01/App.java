package com.byte21.educacionit.java8.oop.class01;

public class App {

    public static void main (String[] ars) {
 
        Student s = new Student();
        s.dni = 123654789;
        s.name = "Raul";
        s.lastName = "Peña";
        
        int b = 1234;
        if (b <= 100) {
            s.age = b;
        }
        
        Student s2 = new Student();
        s2.dni = 122222;
        s2.name = "Homer";
        s2.lastName = "Simpson";
        int a = -963;
        if (a <= 100 && a >= 0) {
            s2.age = a;
        }
        
        
        System.out.println (s.name);
        System.out.println (s2.name);
        
        
    }
}