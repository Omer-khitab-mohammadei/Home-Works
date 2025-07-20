package binarysearch;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Which number do you wnat");
        int want = input.nextInt();
        for (int i = (int) (list.length / 2); i < list.length; i++) {
            if (list[i] == want) {
                System.out.println("The intended number is in " + i);
                return;
            }
        }
        for (int i = (int) (list.length / 2); i >= 0; i--) {
            if (list[i] == want) {
                System.out.println("The intended number is in " + i);
                return;
            }

        }
        System.out.println("The number that you want isn't exit in the array");
    }

