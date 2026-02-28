/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page.pkg25;

import java.util.Scanner;
public class Page25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print(" enter  acceleration : ");
       
       double a = input.nextDouble();
      
       
       System.out.print(" enter speed ");
       
       double v = input.nextDouble();
       
       double l = ((v * v)/ (2* a) );
       
       System.out.println(" the minimum length for this airplane is " + l );
       
               
               
               }
    
}
