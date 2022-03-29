package HomeworkWeek8;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 */

public class Program6TrianglePattern {

    public static void main(String[] args) {

        logic();
    }


    //logic of the class

    public static void logic() {
        int numbrows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        numbrows = sc.nextInt();


        for (int i = 1; i <= numbrows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
