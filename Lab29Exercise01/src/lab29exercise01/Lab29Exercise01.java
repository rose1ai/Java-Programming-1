
package lab29exercise01;

import java.util.Scanner;
public class Lab29Exercise01 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
      System.out.println("enter a word");
      String word = input.next();
      String newWord = word.substring(1)+ word.charAt(0)+ "oi" ;
      System.out.println(newWord);
      
      
    }
    
}
