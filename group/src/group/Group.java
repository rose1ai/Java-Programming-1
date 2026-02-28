/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group;

import java.util.Scanner;

public class Group {

    /*Main method to run the password services program */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our password services project");

        // variables 
        String userPassword;
        int length, serviceID;
        String[] passwords;

        // do while to show the menu
        do {

            // print the menu
            System.out.println("\nTo generate passwords, please enter 1."
                    + "\nTo check the strength of your password, please enter 2."
                    + "\nTo generate passwords and check their strengths, please enter 3."
                    + "\nTo exit the program, please enter 0");

            serviceID = input.nextInt();
            input.nextLine();

            switch (serviceID) { // switch statement

                // exit program
                case 0:
                    System.out.println("Message: Program ended");
                    break;

                // generate and print passwords
                case 1:
                    System.out.println("Enter the password length");
                    length = input.nextInt();
                    passwords = generatePasswords(length);
                    printPasswords(passwords);
                    break;

                // check and print strength
                case 2:
                    System.out.println("Enter your password");
                    userPassword = input.nextLine();
                    int score = checkStrength(userPassword);
                    printStrength(score);
                    break;

                // generate passwords, check strength, and print passwords with strength    
                case 3:
                    System.out.println("Enter the password length");
                    length = input.nextInt();
                    passwords = generatePasswords(length);
                    int[] scores = new int[passwords.length];
                    for (int i = 0; i < passwords.length; i++) {
                        scores[i] = checkStrength(passwords[i]);
                    }
                    printPasswords(passwords, scores);
                    break;

                // default case
                default:
                    System.out.println("Error: Invalid entry");
            }
        } while (serviceID != 0);

    }

    /* ********************************************** */
    /**
     * method generatePasswords uses the Math.random() method to randomly
     * generate three passwords of the chosen length
     *
     * @param length
     * @return
     */
    public static String[] generatePasswords(double length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$_-+=";
        String[] passwords = new String[3];
        for (int k = 0; k < passwords.length; k++) {
            String pass = "";
            for (int j = 0; j < length; j++) {
                int i = (int) (Math.random() * characters.length());
                pass += characters.charAt(i);
            }
            passwords[k] = pass;
        }
        return passwords;

    }

    /* ********************************************** */
    /**
     * method printPasswords displays the content of the array of strings
     *
     * @param passwords: String array
     */
    public static void printPasswords(String[] passwords) {
        System.out.println("Here are a few options:");
        for (int i = 0; i < passwords.length; i++) {
            System.out.println(passwords[i]);
        }
    }

    public static void printPasswords(String[] passwords, int[] scores) {
        for (int i = 0; i < passwords.length; i++) {
            System.out.print(passwords[i] + " ");
            printStrength(scores[i]);
        }
    }

    /* ********************************************** */
    /**
     * method checkStrength calculates and returns the score of the given
     * password
     *
     * @param password_strength_checking
     * @return 
     */
    public static int checkStrength(String password_strength_checking) {
        // creating boolean type variables to check if the password fit each standard or not  
        
        boolean digit = false;
        boolean lower_case_letter = false;
        boolean upper_case_letter = false;
        boolean symbol = false;
        int strength = 0;
        int i = 0;
        while (i < password_strength_checking.length()) {
            char c = password_strength_checking.charAt(i);
            if (Character.isDigit(c)) {
                digit = true;
            } else if (Character.isLowerCase(c)) {
                lower_case_letter = true;
            } else if (Character.isUpperCase(c)) {
                upper_case_letter = true;
            } else {
                symbol = true;
            }
            i++;
        }
        
        // calculating points (strength) of the given password
        if (upper_case_letter) {
            strength++;
        }
        if (lower_case_letter) {
            strength++;
        }
        if (digit) {
            strength++;
        }
        if (symbol) {
            strength++;
        }
        if (password_strength_checking.length() >= 8) {
            strength++;
        }

        return strength;
    }

    /* ********************************************** */
    /**
     * method printStrength prints the corresponding strength to the given score
     *
     * @param strength
     */
    public static void printStrength(int strength) {
        if (strength == 5) {
            System.out.println("This is a very good password!");
        } else if (strength == 4) {
            System.out.println("This is a good password, but you can still do better");
        } else if (strength == 3) {
            System.out.println("This is a medium password, try making it better");
        } else if (strength == 2 || strength == 1 || strength == 0 ) {
            System.out.println("This is a weak password, you should find a new one!");
        }
    }

}
