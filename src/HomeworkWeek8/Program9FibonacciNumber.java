package HomeworkWeek8;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 *
 *
 *
 */

public class Program9FibonacciNumber {
    public static void main(String[] args) {
        main();
    }


    public static void main(){

        int n, a=1, b=1;
        Scanner sc = new Scanner(System.in);
        n=0;
        System.out.println("Enter number");
        int n1 = sc.nextInt();
        System.out.print("1 1");
        while (n<n1)
        {
            n=a+b;
            System.out.print(n + " ");
            a=b;
            b=n;
        }

    }


}
