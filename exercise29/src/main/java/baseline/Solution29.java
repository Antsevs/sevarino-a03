/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution 29
 * Copyright 2021 Anthony Sevarino
 */

package baseline;

import java.util.Scanner;

public class Solution29 {
    public static void main(String[] args) {
        System.out.println("What is the rate of return?");
        boolean status = false;
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        while(status = false) {
            if(Character.isDigit(n)){
                status = true;
                n = 72 / n;
                System.out.println("It will take" + n + " years to double your initial investment");
            } else {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
    }
}
