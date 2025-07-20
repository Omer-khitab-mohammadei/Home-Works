package predicting the future tuition;

import java.util.Scanner;

public class FutureTuition {

    public static void main(String[] args) {
        Scanner name = new Scanner (System.in);
        System.out.println("Please enter the required information about the tuition: ");
        int er  = 0;
        System.out.println("enter the total profit");
    int st = name.nextInt(); 
        System.out.println("enter the tuition");
    int x= name.nextInt();
        System.out.println("enter the percentage of your profit");
      int per = name.nextInt();
        int count = 0;
        while (er <=st){
            
        
         er += (x*per)/100;
        count++;
        
        }
        System.out.println("you will reach the amount "+st +" in :"+count+" years");
        
        
    } 
}
