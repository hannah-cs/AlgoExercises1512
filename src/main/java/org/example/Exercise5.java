package org.example;
//5. Write a Java program to find the maximum number inside the number in
//the window (size k) at each step in a given array of integers with duplicate
//numbers. Move the window to the top of the array. (slide window)
public class Exercise5 {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8};
        for (int i = 0 ; i <= input.length-3 ; i++){
            int largestInWindow = 0;
            int a = input[i];
            int b = input[i+1];
            int c = input[i+2];
            if ((a > b || a==b) && (a > c || a==c)){
                largestInWindow = a;
            } else if ((b > a || b==a) && (b > c || b==c)){
                largestInWindow = b;
            } else if ((c > a || c==a) && (c > b || c==b)){
                largestInWindow = c;
            }
            System.out.println("The largest number in the sequence ["+a+", "+b+", "+c+"] is "+largestInWindow);
        }
    }
}
