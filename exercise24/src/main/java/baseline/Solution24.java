/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 24
 *  Copyright 2021 Anthony Sevarino
 */

/* setup boolean function for true
 * if the two strings are not of equal length, boolean is false
 * convert both strings to fully lowercase
 * put strings in an array
 * sort the array alphabetically
 * if the two arrays are equal, then the boolean remains true
 * get first and second string input from user
 * use isAnagram function to check for anagram presence
 * print resulting outcome
 */

package baseline;

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {
    class function{
        static boolean isAnagram(String first, String second){
            String functionStrng1 = first;
            String functionStrng2 = second;

            boolean status = true;

            if(functionStrng1.length() != functionStrng2.length()){
                status = false;
            } else {
                char[] Arr1 = functionStrng1.toLowerCase().toCharArray();
                char[] Arr2 = functionStrng2.toLowerCase().toCharArray();

                Arrays.sort(Arr1);
                Arrays.sort(Arr2);

                status = Arrays.equals(Arr1, Arr2);
            }

            if(status) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.println("Enter the first string:");
        String first = scnr.nextLine();

        System.out.println("Enter the second string:");
        String second = scnr.nextLine();

        if(function.isAnagram(first, second)){
            System.out.println(first + " and " + second + " are anagrams");
        } else {
            System.out.println(first + " and " + second + " are not anagrams");
        }
    }
}
