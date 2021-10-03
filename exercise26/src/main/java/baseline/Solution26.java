/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 26
 *  Copyright 2021 Anthony Sevarino
 */

/* create PaymentCalculator with given formula rounding to nearest integer
 * get input for balance, APR in percentage form, and monthly payment
 * use calculateMonthsUntilPaidOff to print resulting months remaining
 */

package baseline;

import java.util.Scanner;

public class Solution26 {
    public class PaymentCalculator{
        public static int calculateMonthsUntilPaidOff(double balance, double APR, double monthly){
            APR = APR/365;
            int formula = (int) Math.ceil((-1 / 30.0) * Math.log(1 + balance / monthly
                    * (1 - Math.pow(1 + APR, 30))) / Math.log(1 + APR));
            return formula;
        }
    }

    public static void main(String[] args) {
        int monthsRem;

        Scanner scnr = new Scanner(System.in);

        double balance, APR, monthly;

        System.out.println("What is your balance? ");
        balance = scnr.nextDouble();

        System.out.println("What is the APR on the card (as a percent)? ");
        APR = scnr.nextDouble();
        APR = APR / 100;

        System.out.println("What is the monthly payment you can make? ");
        monthly = scnr.nextDouble();

        monthsRem = PaymentCalculator.calculateMonthsUntilPaidOff(balance, APR, monthly);
        System.out.println("It will take you " + monthsRem + " months to pay off this card.");
    }
}
