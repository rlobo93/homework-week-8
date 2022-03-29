package HomeworkWeek8;

import java.util.Scanner;

public class Program13SharedDigit {
    public static void main(String[] args) {
        hasSharedDigit();
    }


    public static boolean hasSharedDigit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int a = sc.nextInt();
        System.out.println("Please enter second number : ");
        int b = sc.nextInt();

        if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {
            int aLastDigit = a % 10;
            int bLastDigit = b % 10;
            a /= 10;
            b /= 10;
            int aFirstDigit = a;
            int bFirstDigit = b;
            System.out.println("Is there any shared digit in both given number? ");
            return ((aFirstDigit == bFirstDigit) || (aFirstDigit == bLastDigit) || (aLastDigit == bFirstDigit)
                    || (aLastDigit == bLastDigit));

        }

        System.out.println("Invalid Input. ");
        return false;


    }
}
