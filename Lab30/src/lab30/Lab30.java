
package lab30;

import java.util.Scanner;

public class Lab30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enetr x1 and y1");
            
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println(" enetr x2 and y2");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        double p1 = (x2 - x1);
        double p2 = (y2 - y1);
                
        double a = Math.pow(p1, 2);
        double b = Math.pow(p2, 2);
        double z = a + b ;
        
        //double f =Math.sqrt(z);
        
       
        System.out.println("the distance between the two points is " + Math.sqrt(z));
        
        // اقدر اسويها بمعادلة واحدة 
        
        
        
       
        
        
    }
    
}
