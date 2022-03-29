package HomeworkWeek8;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 *
 */

public class Program2MinAndMaxInputChallenge {
    public static void main(String[] args) {
        MinAndMaxInputChallenge();
    }


    public static void  MinAndMaxInputChallenge() {
        Scanner scanner=new Scanner(System.in);

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        while(true){
            System.out.print("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();


            if (isAnInt){
                int number =scanner.nextInt();

                if (number>max){
                    max=number;
                }
                if (number<min){
                    min=number;
                }
            }else {
                break;
            }
            scanner.nextLine(); // handle input
        }
        System.out.println("Min= "+ min + ", Max= "+max);
        scanner.close();

    }
}
