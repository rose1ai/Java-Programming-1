
package lab7p34;

import java.util.Scanner ; 
public class Lab7p34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number_of_student,i=1, score , Highest=0 , secondHighest=0;
        String  name = "", first_Studunt = "" , second_studint = "";
        System.out.println("enter the number of students ");
        number_of_student = input.nextInt();
        // jujhh
       /* System.out.println("ente name of student"+i);
            name = input.next();
            System.out.println("enter score of student");
            score = input.nextInt(); */
        for (i = 1 ; i<=number_of_student ; i++ ){
            System.out.println("ente name of student"+(i));
            name = input.next();
            System.out.println("enter score of student");
            score = input.nextInt();
            
            // Highest = score ;
           //  first_Studunt = name ;
             
            //System.out.println("ente name of student"+i);
           // name = input.next();
            //System.out.println("enter score of student");
           // score = input.nextInt();
           
            if (score > Highest){
                second_studint = first_Studunt ;
                first_Studunt = name ;
                secondHighest = Highest ;
                Highest = score ;
            }
            else  if ( Highest > secondHighest){
                second_studint = first_Studunt ;
                secondHighest = Highest;
                first_Studunt =name ;
                Highest = score ;
            }
 //           else if (score > Highest && score> secondHighest ){
 //           Highest = score ;
 //           secondHighest =Highest ;
 //           second_studint = first_Studunt ;
 //           first_Studunt =name ;
 //           }
        
        
        }
       System.out.println("student with highest is " + first_Studunt  + "and their score is"+ Highest );
       System.out.println("student with second  "+ second_studint  +"and their score is" + secondHighest );       
                
                
                
    }
    
}
