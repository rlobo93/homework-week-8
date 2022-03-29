package HomeworkWeek8;

import java.util.Scanner;

/**
 *Write a program in Java to display the pattern like a diamond. While loop
 *
 *
 */

public class Program14Diamond {


    public static void main(String[] args) {
        logic();
    }


    public static void logic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int num = sc.nextInt();

        int m = 1;
        int n;


        while (m <= num) {
            n = 1;

            while (n++ <= num - m) {
                System.out.print(" ");
            }

            n = 1;
            while (n++ <= m * 2 - 1) {
                System.out.print("*");
            }


            System.out.println();
            m++;
        }


        m = num - 1;

        while (m > 0) {
            n = 1;
            while (n++ <= num - m) {
                System.out.print(" ");
            }

            n = 1;

            while (n++ <= m * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            m--;
        }




    }
}









