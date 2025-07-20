package test2;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        boolean x = true;
        while (x) {
            int rand1 = (int) (Math.random() * 100);
            int rand2 = (int) (Math.random() * 100);
            int answer = rand1 + rand2;
            System.out.println("what is the sum of: " + rand1 + " + " + rand2 + " = ");
            int user = name.nextInt();
            if (user == answer) {
                System.out.println("correct");
                x = false;
            } else {
                System.out.println("wrong");

                
            }

        }
        

    }
}
