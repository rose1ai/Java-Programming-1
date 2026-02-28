
package lab34;
import java.util.Scanner;
public class Lab34 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("enter 3-digit number");
      int number = input.nextInt();
      int firstDigit= number / 100 ;
       int remainder = number % 100 ;
       int lastDigit = remainder % 10 ; 
       
       System.out.println(
               (firstDigit == lastDigit)? "it palindrom" : "not palindrpm "
                       );
      
              
            
    }
    
}
