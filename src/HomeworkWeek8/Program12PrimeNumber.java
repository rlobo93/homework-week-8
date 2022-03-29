package HomeworkWeek8;

import java.util.Scanner;

/**
 *
 *Write a programme to input any number and check if it is prime or not.
 *
 */
public class Program12PrimeNumber {
    public static void main(String[] args) {
logic();
    }


    public static void logic(){
        int num, count=0;
        System.out.println("Enter a Number: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        for (int i=1; i<=num; i++ ){
            if (num% i ==0){
                count++;
            }
        }
        if(count== 2){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a prime number ");
        }
    }

}
