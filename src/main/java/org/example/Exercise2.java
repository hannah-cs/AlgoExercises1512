package org.example;
//2. Write a Java program to prove that Euclid’s algorithm computes the
//greatest common divisor of two integers that have positive values.
//According to Wikipedia "The Euclidean algorithm is based on the principle that
//the greatest common divisor of two numbers does not change if the larger
//number is replaced by its difference with the smaller number. For example, 21 is
//the GCD of 252 and 105 (as 252 = 21 × 12 and 105 = 21 × 5), and the same
//number 21 is also the GCD of 105 and 252 − 105 = 147. Since this replacement
//reduces the larger of the two numbers, repeating this process gives successively
//smaller pairs of numbers until the two numbers become equal. When that occurs,
//they are the GCD of the original two numbers. By reversing the steps, the GCD
//can be expressed as a sum of the two original numbers each multiplied by a
//positive or negative integer, e.g., 21 = 5 × 105 + (−2) × 252. The fact that the
//GCD can always be expressed in this way is known as Bézout's identity."
//Expected Output:
//result: 24
//result: 1
public class Exercise2 {
    public static void main(String[] args) {
    int inputA = 252;
    int inputB = 105;
    int A;
    int B;
    int remainder = 0;
    if (inputB > inputA){
        A = inputB;
        B = inputA;
    } else {
        A = inputA;
        B = inputB;
    }
    if (A % B == 0){
        remainder = B;
    } else {
        while (A % B != 0) {
            remainder = A % B;
            A = B;
            B = remainder;
        }
    }
    double GCD = remainder;
        System.out.println(GCD);
    }
}
