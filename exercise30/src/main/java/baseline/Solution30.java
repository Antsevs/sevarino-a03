/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution 30
 * Copyright 2021 Anthony Sevarino
 */

/* begin initial loop that counts from 1 up to 12
 * nest additional loop with different variable that counts 1 to 12
 * multiply these two variables through every instance
 * align numbers in table without using \t including new line each 12
 */

package baseline;

public class Solution30 {
    public static void main(String[] args) {
        for(int i=1; i<=12;i++){
            for(int n=1; n<=12; n++){
                System.out.format("%5d", i*n);
            }
            System.out.println();
        }
    }
}
