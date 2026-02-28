/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page.pkg22;

import java.util.Scanner;
public class Page22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner fahrenhheit = new Scanner(System.in);
       System.out.println("enter a degrree in fahrenhiet : ");
       
       double f = fahrenhheit.nextDouble();
       
       double celciuse = ((5.0/9) * (f -32));
       
       System.out.println("fehranhiet " + f + " and it's "+ celciuse + "in ");
    }
    
}
