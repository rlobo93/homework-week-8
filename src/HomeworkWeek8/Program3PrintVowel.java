package HomeworkWeek8;

import java.util.Scanner;

public class Program3PrintVowel {

    public static void main(String[] args) {
        VovelorConsonant();
    }

        public static void VovelorConsonant() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input an alphabet");
            String input = sc.next().toLowerCase();

            boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
            boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
            boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o")
                    || input.equals("u");
            if (input.length() > 1) {
                System.out.println("Error. Not a single character");
            } else if (!(uppercase) || (lowercase)) {
                System.out.println("Enter uppercase or lowercase");
            } else if (vowels) {
                System.out.println("Input number is vowel");
            } else {
                System.out.println("Enter number is consonant");
            }


        }

    }

