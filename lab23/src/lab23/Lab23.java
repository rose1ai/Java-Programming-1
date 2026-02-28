
package lab23;


public class Lab23 {

   
    public static void main(String[] args) {
        
        long TimeInMilliSeconds = System.currentTimeMillis();
        
        long TotalSeconds = TimeInMilliSeconds / 1000 ;
       
        long CurrentSeconds = TotalSeconds % 60 ;
        
        long TotalMinuts = TotalSeconds / 60 ; 
        long CurrentMinuts = TotalMinuts % 60 ;
        
        long TotalHours = TotalMinuts / 60 ; 
        long CurrentHours = TotalHours % 24 ;
        
        
        System.out.println("current Time is " + CurrentHours + ":" + CurrentMinuts + ":" +CurrentSeconds + "  GMT" );
    } 
}
