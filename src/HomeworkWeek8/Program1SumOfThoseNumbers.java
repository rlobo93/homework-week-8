package HomeworkWeek8;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those numbers.
 *
 */
public class Program1SumOfThoseNumbers {

    public static void main(String[] args) {
        sum();

    }

    public static void sum () {

        Scanner sc = new Scanner(System.in);

            int count = 1;
            int sum = 0;

            while (count <= 10) {
                System.out.println("Enter number #x" + count);
                boolean validatenumber = sc.hasNextInt();
                if (validatenumber) {
                    int number = sc.nextInt();
                    sum += number;
                    count++;
                } else {
                    System.out.println("Invalid number");
                }
                sc.nextLine();
                System.out.println("Sum of all number = " + sum);
            }
    }





}
