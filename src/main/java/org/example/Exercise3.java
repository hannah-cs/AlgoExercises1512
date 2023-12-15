package org.example;
//Write a Java program to create a two-dimensional array (m x m) A[][] such
//that A[i][j] is false if i and j are prime otherwise A[i][j] becomes true.

public class Exercise3 {
    public static void main(String[] args) {
        int[] input = new int[]{7, 11};
        Boolean notBothPrime = false;
        if (!isPrime(7) || !isPrime(12)){
            notBothPrime = true;
        }
        System.out.println(notBothPrime);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num/2; i++) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
