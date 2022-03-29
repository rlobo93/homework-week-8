package HomeworkWeek8;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 *
 */
public class Program10ArmstrongNumber {


    public static void main(String[] args) {
        main();
    }

    public static void main() {

        int n, arm = 0, rem, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        n = sc.nextInt();
        c = n;

        while (n > 0) {

            rem = n % 10;
            arm = (rem * rem * rem) + arm;
            n = n / 10;
        }
        if (c == arm)
            System.out.println(" Armstrong number");
        else
            System.out.println("Not  Armstrong number");
    }
}






