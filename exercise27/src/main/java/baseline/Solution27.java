/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */

/* get user first and last name and restrict to only letters
 * in validateInput add minimum 2 letter restriction
 * get user zip code
 * in validateInput restrict zip code to only numbers and exactly 5 numbers
 * get user employee ID
 * in validateInput restrict as per instructions
 * print message showing any errors in these inputs
 */

package baseline;

import java.util.Scanner;

public class Solution27 {
    static String result1 = "";
    static String result2 = "";
    static String result3 = "";
    static String result4 = "";

    public static void main(String[] args) {
        //prompt user for and scan for all required information
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String firstN = scnr.nextLine();

        System.out.println("Enter the last name: ");
        String lastN = scnr.nextLine();

        System.out.println("Enter the ZIP code: ");
        String zip = scnr.nextLine();

        System.out.println("Enter the employee ID: ");
        String empID = scnr.nextLine();

        //use validateInput to print resulting error message
        validateInput(firstN, lastN, zip, empID);
    }

    public static void validateInput(String firstN, String lastN, String zip, String empID){
        boolean N1 = validateFirstN(firstN);
        boolean N2 = validateLastN(lastN);
        boolean zipC = validateZip(zip);
        boolean emp = validateEmpID(empID);

        if(N1 && N2 && zipC && emp){
            result1 = "There were no errors found.";
        }
        System.out.println(result1 + "\n" + result2 + "\n" + result3 + "\n" + result4);
    }

    //lets get this first name setup
    public static boolean validateFirstN(String firstN){
        boolean status = true;
        //name must be at least 2 characters
        if(firstN.length() < 2){
            result1 = "The first name must be at least 2 characters long.";
            status = false;
        }
        //first name must have something there
        if(firstN.length() == 0){
            result1 = "The first name must be filled in.";
            status = false;
        }
        return status;
    }
    //time for the last name to be valid af
    public static boolean validateLastN(String lastN){
        boolean status = true;
        //once again name is 2 characters at least
        if(lastN.length() < 2){
            result2 = "The last name must be at least 2 characters long.";
            status = false;
        }
        if(lastN.length() == 0){
            result2 = "The last name must be filled in.";
            status = false;
        }
        return status;
    }

    //now lets validate the zip code
    public static boolean validateZip(String zip){
        boolean status;
        //zip code must be 5 characters exactly
        if(zip.matches("[0-9]{5}")){
            status = true;
        } else {
            result3 = "The ZIP code must be a 5 digit number.";
            status = false;
        }
        return status;
    }

    public static boolean validateEmpID(String empID){
        boolean status = true;
        //employee ID must follow the proper format
        if(empID.matches("[a-zA-Z]{2}[-]{1}[0-9]{4}")){
            status = true;
        } else {
            result4 = "The employee ID must be in the format of AA-1234";
            status = false;
        }
        return status;
    }
}
