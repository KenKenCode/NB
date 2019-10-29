
package javaapplication3;
import java.math.*;
import java.util.*;
/**
 *
 * @author Ken
 */
public class JavaApplication3 {
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner readinput1 = new Scanner (System.in);
        
         System.out.println("1. 1 for triangle program \n 2. 2 for arithmetic mean or average \n 3. 3 for probability");
         int choosetheprogram = readinput1.nextInt();
         if (choosetheprogram == 1) {
             Triangle triangleprogram = new Triangle();
        //The triangle program should open in the system console
         }
        
        //Add a class for other remaining and upcoming programs, use less classes if possible
              //Arithmetic mean (average) = Sum of values / Number of Values
        System.out.println("Input the sum of values: ");
        int sumofvalues = readinput1.nextInt();
        System.out.println("Input the number of values: ");
        int numberofvalues = readinput1.nextInt();
        int total1 = sumofvalues / numberofvalues;
        System.out.println("Arithmetic mean or average: " + total1);
        System.exit(0);
        
        //Probability
        System.out.println("Input the target outcomes");
        int targetoutcomes = readinput1.nextInt();
        System.out.println("Input the total outcomes");
        int totaloutcomes = readinput1.nextInt();
        System.exit(0);
        
        //Quadratic formula
       
        
        
   
        
        
        
    }
    
}









