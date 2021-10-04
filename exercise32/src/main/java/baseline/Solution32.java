/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 32
 *  Copyright 2021 Anthony Sevarino
 */

/* create a random number generator for each difficulty with proper ranges
 * after user inputs difficulty level, computer picks random number
 * create loop that will continually ask user for number until it matches
 * create counter to count how many attempts it takes user to successfully guess
 * tell user if their guess is below or above the selected number
 * print number of attempts taken
 * prompt user to play again, if Y then resent counter to 0
 */

package baseline;

import java.util.Random;
import java.util.Scanner;

public class Solution32 {
    public static void main(String[] args) {
        Random computerNum = new Random();
        int upperbound, compGuess = 0;
        boolean status;
        Scanner scnr = new Scanner(System.in);
        int lowerbound = 0;
        System.out.println("Let's play Guess the Number!\nEnter the difficulty level (1, 2, or 3): ");
        String difficulty = scnr.nextLine();
        int range;
        while(true)
            if(difficulty.equals("1")){
                upperbound = 10;
                range = upperbound - lowerbound + 1;
                compGuess = (int)(Math.random() * range) + lowerbound;
                System.out.println("ok");
            } else if(difficulty.equals("2")){
                upperbound = 100;
                range = upperbound - lowerbound + 1;
                compGuess = (int)(Math.random() * range) + lowerbound;
            } else if(difficulty.equals("3")){
                upperbound = 1000;
                range = upperbound - lowerbound + 1;
                compGuess = (int)(Math.random() * range) + lowerbound;
            } else {
                System.out.println("please input a valid difficulty level.");
            }
        while(status){
            System.out.println("I have my number. What's your guess? ");
            String userGuess = scnr.nextLine();
            int count = 0;
            if(userGuess.equals(computerNum)){
                System.out.println("You got it in " + count + " guesses!");
                System.out.println("\nDo you wish to play again (Y/N)?");
                String replay = scnr.nextLine();
                if(replay.equals("N") || replay.equals("n")){
                    status = true;
                } else if(replay.equals("Y") || replay.equals("y")){
                    status = false;
                }
            } else if(Integer.parseInt(userGuess) > compGuess) {
                System.out.println("Too high. Guess again: ");
                count = count + 1;
            } else if(Integer.parseInt(userGuess) < compGuess) {
                System.out.println("Too low. Guess again: ");
                count = count + 1;
            } else {
                System.out.println("Please enter a numeric value: ");
                count = count + 1;
            }
        }
    }
}
