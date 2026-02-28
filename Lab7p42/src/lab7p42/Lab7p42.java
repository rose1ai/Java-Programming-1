
package lab7p42;

public class Lab7p42 {

    public static void main(String[] args) {
      int sum = 0 ; 
      
      for(int num = 1 ; num <= 1000 ; num++){
          
          if(num%2 == 0)
              continue;
          
          sum += num ;
          
          if (sum >500)
              break;
      }
      System.out.println("sum = "+sum );
      
      
      
      
    }
    
}
