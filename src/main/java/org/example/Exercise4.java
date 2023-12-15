package org.example;

import java.util.Arrays;

//4. Write a Java program to find the k largest elements in a given array.
//Elements in the array can be in any order.
//Expected Output:
//Original Array (assume that an array contains at least one element and the
//k>=1):
//[1, 4, 17, 7, 25, 3, 100]
//3 largest elements of the said array are:
//100 25 17
public class Exercise4 {
    public static void main(String[] args) {
        int[] inputArray = new int[]{1, 4, 17, 7, 25, 3, 100};
        Arrays.sort(inputArray);
        if (inputArray.length <= 3){
            System.out.println("Input array not long enough.");
        }
        int[] top3 = new int[]{inputArray[inputArray.length-1], inputArray[inputArray.length-2], inputArray[inputArray.length-3]};
        System.out.println("Largest 3 numbers in array:");
        for (int i = 0; i <= top3.length-1 ; i++){
            System.out.println(top3[i]);
        }
    }
}
