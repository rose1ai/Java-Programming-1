
package lab33;

import java.util.Scanner;

public class Lab33 {

    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter grade");
      char x = input.next().charAt(0);
     // System.out.println("enter grade");
      switch (x) {
        case 'A' : 
        System.out.println("excellent");
        break;
        case 'B' : 
        System.out.println("good ");
        break;
        case 'c':
            System.out.println("avarage");
            break;
        case 'D':
            System.out.println("deficient");
            break;
        case 'F':
            System.out.println("fail");
            break;
        default :
            System.out.println(" wrong try again ");
   
                 }
    }
    }
    

