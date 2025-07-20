package Sentinel Value;

import java.util.Scanner;

public class SentinelValue {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        boolean condation = true;
        while (condation) {
            System.out.println("enter a number , but not zero, to get the prize");
            int x = name.nextInt();
            if (x == 0) {
                System.out.println("you have lost");
                condation = false;
            } else {
                System.out.println("you won --> 2000$");

            }
        }

    }
}
