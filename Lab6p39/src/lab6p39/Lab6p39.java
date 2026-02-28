
package lab6p39;
import java.util.Scanner;

public class Lab6p39 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int number , positive = 0 , negative = 0;
     double total =0 , avarage ;
     System.out.println("enter number ");
     number = input.nextInt();
   while (number!=0){
        total+=number ;
        if (number > 0 ){
            positive++;
        }else if(number <0){
            negative++;}
        number = input.nextInt();
    }
   avarage = total / (positive +negative );
   System.out.println("the positives is "+positive);
   System.out.println("the negative is "+negative);
   System.out.println("the total is "+total);
   System.out.println("the avarage is "+avarage);
    
    
    }
     
        
        
    }
    
