/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution 31
 * Copyright 2021 Anthony Sevarino
 */

/* get the resting heart rate from the user (continue until proper input)
 * get age from user (continue until proper input)
 * create a function that will determine if the above two inputs are integers
 * use the calculation given to find target heart rate for each intensity level
 */

package baseline;

import java.util.Scanner;

public class Solution31 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int rest, age, intensity, rate;
        //keep asking user until they stop being rude and give a proper answer
        while(true) {
            System.out.println("Resting Pulse: ");
            String strng1 = scnr.nextLine();
            //use separate function to check if the input is a number
            if (numCheck(strng1)) {
                rest = Integer.parseInt(strng1);
                break;
            } else {
                System.out.println("Please enter valid pulse.");
            }
        }
        //do the same thing I said above but with the age now
        while(true){
            System.out.println("Age: ");
            String strng1 = scnr.nextLine();
            //this is where the separate function comes in again
            if(numCheck(strng1)){
                age = Integer.parseInt(strng1);
                break;
            } else {
                System.out.println("Please enter valid age.");
            }
        }
        //print everything with proper table formatting
        System.out.println("Intensity \t | Rate");
        System.out.println("----------------------");
        for(intensity = 55; intensity <= 95; intensity +=5){
            rate = ((220 - age - rest) * intensity / 100) + rest;

            System.out.println(intensity + "%\t\t\t | " + rate + " bpm");
        }
    }

    /*this is where that separate function that checks if the input is a
     * number or not is hiding
     */
    public static boolean numCheck(String strng1){
        try{
            Integer.parseInt(strng1);
        } catch(Exception e){
            return false;
        }
        return true;
    }
}
