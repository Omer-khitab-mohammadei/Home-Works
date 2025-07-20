package An advanced math learning tool;

import java.util.Scanner;

public class MathLearningTool {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        int x = 1;
        while (x <= 5) {
            int rand1 = (int) (Math.random() * 100);
            int rand2 = (int) (Math.random() * 100);

            int answer = rand1 - rand2;

            System.out.println("what is the result of: " + rand1 + " - " + rand2);
            int user = name.nextInt();
            if (user == answer) {
                System.out.println("correct");
                x++;
            } else {
                System.out.println("wrong");
            }

        }
    }

}
