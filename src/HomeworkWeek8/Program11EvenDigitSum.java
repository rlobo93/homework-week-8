package HomeworkWeek8;


/**
 * Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 */

public class Program11EvenDigitSum {


    public static void main(String[] args) {
        getEvenDigitSum(56656);
    }


    public static int getEvenDigitSum(int number) {

        int total = 0;

        if (number > 0) {
            while (number != 0) {
                int even = number % 10;
                if (even % 2 == 0) {
                    total += even;
                }
                number /= 10;
            }
            System.out.println(total);
        }
        return -1;


    }
}



