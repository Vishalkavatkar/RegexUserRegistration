package com.Day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * In this class we defined and checked the regex pattern.
 * We have used 2 class Pattern and Matcher for checking & matching the pattern
 * We have created this method to check the regex pattern for the first name
 *
 */

public class UserDetails {
    public String regex;

    /**
     * We have created this method to check the regex pattern for the first name
     * We are passing the first name to this method
     * Then we define the regex pattern
     * First name starts with Cap and has minimum 3 characters
     * We have used the compile method of the pattern class to create the object for the pattern
     * Then we use the Matcher class to interpret the pattern object & it checks the string passed if it matches the pattern
     * Then we are using the matches() method which will return a boolean value to check if it matches or not.
     * @param firstName - Here we pass the first name of the user to check
     */
    public void firstName(String firstName) {
        regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("Valid Input");
        } else {
            System.out.println("Sorry!! InValid Input");
        }
    }
}
