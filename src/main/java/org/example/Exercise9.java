package org.example;
//9. Write a Java program to sum two non-negative integers num1 and num2
//represented as strings, return the sum of num1 and num2.
//Expected Output:
//'123' + '456' = 579
public class Exercise9 {
    public static void main(String[] args) {
        String numA = "123";
        String numB = "456";
        int a = Integer.parseInt(numA);
        int b = Integer.parseInt(numB);
        int result = a + b;
        System.out.println(numA+" + "+numB+" = "+result);
    }
}
