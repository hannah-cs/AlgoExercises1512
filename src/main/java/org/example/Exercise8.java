package org.example;

import java.util.Arrays;

//8. Write a Java program to find all the start indices of a given string's
//anagrams in another given string.
//Expected Output:
//Original String: zyxwyxyxzwxyz
//Starting anagram indices of xyz: [0, 6, 10]
//Xyz
//Zyx
//Yxz
//Yzx
public class Exercise8 {
    public static void main(String[] args) {
        String inputString = "zyxwyxyxzwxyz";
        String toFind = "xyz";
        String a = "silent";
        String b = "listen";
        char[] cha = a.toCharArray();
        char[] chb = b.toCharArray();
        Arrays.sort(cha);
        Arrays.sort(chb);
        System.out.println(isAnagram(cha, chb));
    }
    public static boolean isAnagram(char[] str1, char[] str2) {
        if (str1.length != str2.length) {
            return false;
        }
        for (int i=0 ; i<str1.length ; i++){
            for (int j=0 ; j<str2.length ; j++){
                if ((str1[i] == (str2[j]))){
                    return true;
                }
            }
        }
        return false;
    }
}