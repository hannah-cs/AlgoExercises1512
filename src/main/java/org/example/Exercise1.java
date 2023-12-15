package org.example;

//1. Write a Java program to find the value of a specified expression.
//a) (101 + 0) / 3
//b) 3.0e-6 * 10000000.1
//c) true && true
//d) false && true
//e) (false && false) || (true && true)
//f) (false || false) && (true && true)

public class Exercise1 {
    public static void main(String[] args) {

        double resultA = (101 + 0) / 3;
        System.out.println("Exercise A: "+resultA);

        double resultB = 3.0e-6 * 10000000.1;
        System.out.println("Exercise B: "+resultB);

        boolean resultC = true && true;
        System.out.println("Exercise C: "+resultC);

        boolean resultD = false && true;
        System.out.println("Exercise D: "+resultD);

        boolean resultE = (false && false) || (true && true);
        System.out.println("Exercise E: "+resultE);

        boolean resultF = (false || false) && (true && true);
        System.out.println("Exercise F: "+resultF);


    }
}