package HomeworkWeek8;

import java.util.Scanner;

/**
 * First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 *
 *
 */

public class Program7FirstAndLastDigitSum {
    public static void main(String[] args) {
main();
    }


    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int lastDigit=number%10;
        int firstDigit=number;
        while (firstDigit>=10){
            firstDigit=firstDigit/10;
        }

        System.out.println("First Digit: "+firstDigit);
        System.out.println("Last Digit: "+lastDigit);
        System.out.println("sum: "+(firstDigit+lastDigit));

    }

}
