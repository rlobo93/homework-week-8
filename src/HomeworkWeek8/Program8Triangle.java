package HomeworkWeek8;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 */

public class Program8Triangle {
    public static void main(String[] args) {

        logic();
    }

    public static void logic() {

        Scanner r = new Scanner(System.in);
        System.out.println("Enter rows between 1 to 10: ");

        int rows = r.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }


}
