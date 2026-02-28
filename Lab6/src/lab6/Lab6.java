
package lab6;
import java.util.Scanner;
public class Lab6 {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int number ; 
       
       System.out.println("enter a positive integer ");
       number = input.nextInt();
       
       System.out.println("the multipliction table of" + number);
       
       for (int i = 1; i <= 10;i++)
       {
          System.out.println(number + " x "+i + " = "+(i*number));
          
           
       }
       }
        
        
        
    }
    

