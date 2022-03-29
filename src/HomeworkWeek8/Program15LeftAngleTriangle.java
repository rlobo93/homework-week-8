package HomeworkWeek8;

import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 *
 */
public class Program15LeftAngleTriangle {
    public static void main(String[] args) {
        logic();
    }

    public static void logic() {

        Scanner r = new Scanner(System.in);
        System.out.println("Enter number of rows between 1 to 10: ");

        int n = r.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
