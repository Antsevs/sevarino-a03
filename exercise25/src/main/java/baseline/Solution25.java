/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution 25
 * Copyright 2021 Anthony Sevarino
 */

/* setup boolean for each possible input (special character, digit, letters)
 * set an array for all viable special characters
 * set the password to an array and check each input for digit, special character, and letter
 * check for length of password and assign proper strength checking with letters digits and sp characters
 * scan for input and use passwordValidator function
 * print resulting strength
 */


package baseline;

import java.util.Arrays;
import java.util.Scanner;

public class Solution25 {
    private static void symbolCheck(char[] specialCharacters, char sp){
        boolean test = Arrays.asList(specialCharacters)
                .contains(sp);
    }

    public static void passwordValidator(String password) {
        boolean digits = false, letters = false, symbols = false;
        char[] specialCharacters = {'!','@','#','$','%','^','&','*','(',')','-','+'};
        char sp = 0;
        int passLeng = password.length();
        for(char i: password.toCharArray()){
            if(Character.isDigit(i)){
                digits = true;
            }
            symbolCheck(specialCharacters, sp);
            if(Character.isLetter(i)){
                letters = true;
            }
        }
        if((digits && letters && symbols) && (passLeng >=8)) {
            System.out.println("The password '" + password + "' is a very strong password.");
        } else if((letters && digits) && passLeng >=8) {
            System.out.println("The password '" + password + "' is a strong password.");
        } else if(letters && (passLeng < 8)){
            System.out.println("The password '" + password + "' is a weak password.");
        } else if(digits && passLeng < 8){
            System.out.println("The password '" + password + "' is a very weak password.");
        } else {
            System.out.println("Password is of unknown strength");
        }
    }

    public static void main(String[] args) {
        String password;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Password: ");
        password = scnr.nextLine();
        passwordValidator(password);
    }
}
