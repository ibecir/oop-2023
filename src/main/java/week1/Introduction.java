package week1;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        printName("Becir Isakovic");
        numOfSecondsInYear(2);
        sumNumbers();
        isNumberPositiveOrNegative();
        checkNumbersEquality();
    }

    public static void printName(String name) {
        System.out.println("The name passed is " + name);
    }

    public static void numOfSecondsInYear(int numOfYears) {
        System.out.println("In ".concat(String.valueOf(numOfYears)).concat("there are ").concat(String.valueOf(numOfYears * 365 * 24 * 60 * 60)));
    }

    public static void sumNumbers() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first integer: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second integer: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        System.out.println("The sum of numbers is ".concat(String.valueOf(firstNumber + secondNumber)));
    }

    public static void isNumberPositiveOrNegative() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type an integer: ");
        int number = Integer.parseInt(reader.nextLine());
        String message = number % 2 == 0 ? "The number " + number + " is positive" : "The number " + number + " is negative";
        System.out.println(message);
    }

    public static void checkNumbersEquality() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first integer: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second integer: ");
        int secondNumber = Integer.parseInt(reader.nextLine());

        if (firstNumber == secondNumber) {
            System.out.println("Equal numbers");
        } else if (firstNumber > secondNumber) {
            System.out.println("First number is greater");
        } else {
            System.out.println("Second number is greater¬");
        }
    }
}
