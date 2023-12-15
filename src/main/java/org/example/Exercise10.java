package org.example;

import java.util.ArrayList;

//10. Write a Java program that checks whether an array of integers
//        alternates between positive and negative values.
//        Example:
//        Original array: [1, -2, 5, -4, 3, -6]
//        Result: true
//        Origanl array: [-4, 6, -3, 7, -9, 2, -7]
//        Result: true
public class Exercise10 {
    public static void main(String[] args) {
        int[] inputArray1 = new int[]{1, -2, 5, -4, 3, -6};
        int[] inputArray2 = new int[]{-4, -6, -3, 7, -9, 2, 7};
        System.out.println(isAlternating(inputArray1));
        System.out.println(isAlternating(inputArray2));

    }
    public static boolean isAlternating(int[] input){
        int countSuccessful = 0;
        for (int i = 0 ; i < input.length-1 ; i++){
            if ((input[i] < 0 && input[i+1] >= 0) || (input[i] >= 0 && input[i+1] < 0)){
                countSuccessful++;
                System.out.println(countSuccessful);
            }
        }
        return countSuccessful == input.length-1;
    }
}
