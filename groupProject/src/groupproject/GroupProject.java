package groupproject;

/**
 *
 * @author rosea
 */
import java.util.Scanner;

public class GroupProject {
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
                char t;
        int y = (int) (Math.random() * 6);
        // the sympols switch
        switch (y) {
            case 5:
                t = '@';
                break;
            case 4:
                t = '$';
                break;
            case 3:
                t = '!';
                break;
            case 2:
                t = '%';
                break;
            case 1:
                t = '&';
                break;
            case 0:
                t = '*';
                break;
            default:
                t = 'r';
        }
        //caps array
        char[] caps = new char[26];
        char j = 'A';
        for (int c = 0; c < 26; j++, c++) {
            caps[c] = j;

        }
        //small letters array
        char[] sm = new char[26];
        char e = 'a';
        for (int c = 0; c < 26; e++, c++) {
            sm[c] = e;
        }
                //generating the passwords

                String[] passwords = new String[3];

                String word;
              
   String numbers="0123456789";
           for(int r=0; r<passwords.length; r++){  
            word="";
               for (int s = 0; s < length; s++) {
                   int random=(int)(Math.random()*4)+1;
               
                   if(random==1){   
                         int vv=(int)(Math.random()*25)+1;
                     word+=caps[vv];
                 }  
                 else if(random==2){
                           int vv=(int)(Math.random()*25)+1;
                       word+=sm[vv];
                 }
                else if(random==3){
                         //  int vv=(int)(Math.random()*25)+1;
                       word+=t;   }
                       else{
                              int vv=(int)(Math.random()*10);
                      word+=   numbers.charAt(vv);
                         }
                   
               
    }    passwords[r]=word;  }
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

    public static void printPasswords(String[] passwords, int[] strength) {
        for (int x = 0; x < passwords.length; x++) {
            System.out.print(passwords[x] + " ");
            printStrength(strength[x]);
        }
    }

    /* ********************************************** */
    /**
     * method checkStrength calculates and returns the score of the given
     * password
     *
     * @param password_strength_checking
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
     * @param score
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

