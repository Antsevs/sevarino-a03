/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution 28
 * Copyright 2021 Anthony Sevarino
 */

/* Establish a loop with two counters, one to manage number of inputs, and one to contain user inputs
 * Prompt user for first input and store resulting number
 * after 5 iterations, add the store numbers and print the result
 */

package baseline;

import java.util.Scanner;

public class Solution28 {
    public static void main(String[] args) {
        //establish main variable and scanner
        int sum = 0;
        Scanner scnr = new Scanner(System.in);
        //loop 5 times
        for (int n = 0; n < 5; n++) {
            System.out.println("Enter a number: ");
            //add the scanner input to the sum each iteration
            sum += scnr.nextInt();
        }
        //print resulting sum
        System.out.println("The total is " + sum + ".");
    }
}
