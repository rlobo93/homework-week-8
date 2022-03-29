package HomeworkWeek8;

import java.util.Scanner;

/**
 * Digit Sum Challenge
 */
public class Program4DigitSumChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n1= sc.nextInt();
        System.out.println("Sum is : "+SumDigits(n1));

    }



    public static int SumDigits(long n) {

        int results = 0;

        if (n < 10) return -1;
        while (n > 0) {
            results += n % 10;
            n /= 10;
        }

        return results;
    }

}
