/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 33
 *  Copyright 2021 Anthony Sevarino
 */


/* create an array with the potential responses
 * add randomizer and apply it to the array
 * scan for user question
 * print response
 */
package baseline;

import java.util.Random;
import java.util.Scanner;

public class Solution33 {
    public static void main(String[] args) {
        //make the array of choices
        String[] ballChoice = {"Yes", "No", "Maybe", "Ask again later"};

        //establish random type
        Random rand = new Random();

        Scanner scnr = new Scanner(System.in);

        //putting int into method that can be understood by rand type and assigning that value to array
        int randAns = rand.nextInt(ballChoice.length);
        String ballAns = ballChoice[randAns];

        //print resulting choice after user prompt
        System.out.println("What's your question?");
        String userQ = scnr.nextLine();
        System.out.println("\n" + ballAns);
    }
}
