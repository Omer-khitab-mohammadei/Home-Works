package hextodec;

import java.util.Scanner;

public class hextodec {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a hexadecimal number");
        String hex = input.nextLine();

        int decimal = 0;
        int base = 1;
        int value = 0;

        int i = hex.length() - 1;
        while (i >= 0) {
            char ch = hex.charAt(i);
            switch (ch) {
                case '0':
                    value = 0;
                    break;
                case '1':
                    value = 1;
                    break;
                case '2':
                    value = 2;
                    break;
                case '3':
                    value = 3;
                    break;
                case '4':
                    value = 4;
                    break;
                case '5':
                    value = 5;
                    break;
                case '6':
                    value = 6;
                    break;
                case '7':
                    value = 7;
                    break;
                case '8':
                    value = 8;
                    break;
                case '9':
                    value = 9;
                    break;
                case 'A':
                case 'a':
                    value = 10;
                    break;
                case 'B':
                case 'b':
                    value = 11;
                    break;
                case 'C':
                case 'c':
                    value = 12;
                    break;
                case 'D':
                case 'd':
                    value = 13;
                    break;
                case 'E':
                case 'e':
                    value = 14;
                    break;
                case 'F':
                case 'f':
                    value = 15;
                    break;
                default:
                    System.out.println(hex + " is Invalid character: ");
                    return;
            }

            decimal = decimal + value * base;
            base = base * 16;
            i--;
        }

        System.out.println("Decimal value of "+hex+" is: " + decimal);
    }
}
