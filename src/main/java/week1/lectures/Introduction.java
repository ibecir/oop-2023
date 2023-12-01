package week1.lectures;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        argsTest(args);
    }

    public static void argsTest(String[] args){
        for (int i = 0; i < args.length; i++)
            System.out.println("Argument passed ar position " + i + " is: " + args[i]);
    }
    public static void simpleCalculator() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to simple calculator");
        List<String> options = Arrays.asList("sum", "difference", "quit");

        while (true) {
            System.out.println("Please enter your selection: sum, difference or quit");
            String command = reader.nextLine();

            if (options.contains(command)) {
                if(command.equals("quit")){
                    break;
                }
                System.out.println("Enter first number: ");
                int firstNumber = Integer.parseInt(reader.nextLine());

                System.out.println("Enter second number: ");
                int secondNumber = Integer.parseInt(reader.nextLine());

                if(command.equals("sum")){
                    System.out.println("The sum of provided numbers is: " + (firstNumber + secondNumber));
                }

                System.out.println("The difference of provided numbers is: " + (firstNumber - secondNumber));
            }
        }
    }
}
