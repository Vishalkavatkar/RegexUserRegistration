package com.Day19;

import java.util.Scanner;
/**
 * This is the main method where we have called the methods to compute it.
 *
 */

public class RegexUserMain {
	RegexUserRegistration regexUserRegistration = new RegexUserRegistration();
    Scanner scanner = new Scanner(System.in);

    /**
     * We have put a while loop then the user closes the scanner.
     */
    public void choice() {
        while (true) {
            System.out.println(" \n1 To Check First Name\n"
                    + "2 To Check Last Name\n"
                    + "0 To Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 :
                    regexUserRegistration.userFirstName();
                    break;
                case 2 :
                    regexUserRegistration.userLastName();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default :
                    System.out.println("Enter the wrong input \n Please enter the Correct input");
                    continue;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\n Welcome to the User Registration program by Regex \n");
        RegexUserMain regexUserMain = new RegexUserMain();
        regexUserMain.choice();
        regexUserMain.scanner.close();
    }
}