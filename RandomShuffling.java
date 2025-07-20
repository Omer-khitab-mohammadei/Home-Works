package randomshuffling;

import java.util.Scanner;

public class RandomShuffling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[5];
        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        list[3] = 4;
        list[4] = 5;

        for (int i = list.length - 1; i > 0; i--) {
            int Rnumber = (int) (Math.random() * (i + 1));
            int temp = list[i];
            list[i] = list[Rnumber];
            list[Rnumber] = temp;
        }
        for (int k = 0; k < list.length; k++) {
            System.out.print(list[k]);
        }
        System.out.println();
    }

}
