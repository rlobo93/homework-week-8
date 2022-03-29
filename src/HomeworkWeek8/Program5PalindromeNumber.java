package HomeworkWeek8;

import java.util.Scanner;

/**
 *
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 *
 */

public class Program5PalindromeNumber {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.printf("Is the number %d a palindrome number?\n", n);
        System.out.println(is_Palindrome(n));
    }

    public static int reverse_nums(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse *= 10;
            reverse += n % 10;
            n /= 10;
        }
        return reverse;
    }

    public static boolean is_Palindrome(int n) {
        return (n == reverse_nums(n));
    }


}









