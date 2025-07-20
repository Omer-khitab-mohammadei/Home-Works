
package the greatest common divisor;

import java.util.Scanner;
 
public class The Greatest Common Divisor {

    
    public static void main(String[] args) {
        Scanner name = new Scanner (System.in);
        System.out.println("insert two numbers to see there GCD");
        int num1 ,num2;
        num1 = name.nextInt();
        num2 = name.nextInt();
        int gcd = 0;
        for (int x = 1 ; (x<=num1) && (x<=num2); x++){
                if (num1%x==0 && num2%x==0){
                   gcd = x;
                    /*the below statment is used to see all of the common divisors , 
                   not the greatest C D ,between the tow numbers
                   System.out.println(x);
                    */
                }
        }
        System.out.println("the greatest common dicvisor is: " +gcd);
        
         
    }
    
}
