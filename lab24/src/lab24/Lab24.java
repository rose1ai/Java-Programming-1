
package lab24;

import java.util.Scanner;
public class Lab24 {

    
    public static void main(String[] args) {
       Scanner input =  new Scanner(System.in);
       System.out.println(" enter a number between 0 and 1000 ");
       int number = input.nextInt();
       
       int digit1 = number % 10 ; 
       number = number / 10 ;
       int digit2 = number % 10 ; 
       
       int diget3 = number / 10; 
       
       System.out.println(" the sum of the digits is "+ (digit1 +digit2 +diget3) );
       
        
        
    }
    
}
