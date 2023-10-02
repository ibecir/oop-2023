package week2.labs;

import java.util.Random;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        guessPassword();
//        threeNumbersSumV1();
//        threeNumbersSumV2();
//        nNumbersSum();
//        getNumbersInRange();
//        calculateNthPower();
//        printStars(5);
//        guessNumber();
        drawStarsPiramid(10);
        drawNumbersPiramid(10);
        drawInvertedPiramid(10);
    }

    public static void guessPassword() {
        Scanner reader = new Scanner(System.in);
        String correct_password = "carrot";
        int correct = 0;
        while (correct != 1) {
            System.out.println("Enter password");
            String user_password = reader.nextLine();

            if (correct_password.equals(user_password)) {
                correct = 1;
            }
        }
        System.out.println("Secret is 'carrot'");
    }

    public static void threeNumbersSumV1() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number:");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number:");
        int num2 = Integer.parseInt(reader.nextLine());
        System.out.println("Type the third number:");
        int num3 = Integer.parseInt(reader.nextLine());
        System.out.println(num1 + num2 + num3);
    }

    public static void threeNumbersSumV2() {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int num;
        for (int i = 0; i < 3; i++) {
            System.out.println("Type the " + (i + 1) + ". number:");
            num = Integer.parseInt(reader.nextLine());
            sum += num;
        }
        System.out.println(sum);
    }

    public static void nNumbersSum() {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int num;
        while (true) {
            System.out.println("Type the number:");
            num = Integer.parseInt(reader.nextLine());

            if (num == 0) break;

            sum += num;
            System.out.println("Sum: " + sum);
        }

        System.out.println("Sum at the end: " + sum);
    }

    public static void getNumbersInRange() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the start number:");
        int start = Integer.parseInt(reader.nextLine());

        System.out.println("Type the end number:");
        int end = Integer.parseInt(reader.nextLine());

        while (start < end) {
            System.out.println(start);
            start++;
        }
    }

    public static void calculateNthPower() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the power");
        int power = Integer.parseInt(reader.nextLine());
        int sum = 1;

        for (int i = 1; i <= power; i++) {
            sum = sum * 2;
        }

        System.out.println("Sum is " + sum);
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    public static void guessNumber() {
        Scanner reader = new Scanner(System.in);
        int random_number = drawNumber();
        System.out.println(random_number);

        int attempts = 0;

        System.out.print("Guess the number : ");
        int guess = reader.nextInt();
        while (guess != random_number) {
            if (guess > random_number) {
                attempts += 1;
                System.out.println("Lower!  -  This is your " + attempts + ". guess !");
            } else if (guess < random_number) {
                attempts += 1;
                System.out.println("Higher!   -  This is your " + attempts + " guess !");
            }
            guess = reader.nextInt();
        }
        System.out.println("You are correct!");
        System.out.println("You made " + (attempts + 1) + " guesses !");
    }

    public static int drawNumber() {
        Random rand = new Random();
        int random_number = rand.nextInt(100);

        return random_number;
    }

    /* NEW TASK */
    public static void drawStarsPiramid(int rows) {
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* NEW TASK */
    public static void drawNumbersPiramid(int rows) {
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /* NEW TASK */
    public static void drawInvertedPiramid(int rows) {
        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
