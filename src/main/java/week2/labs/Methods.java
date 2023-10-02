package week2.labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
//        countNumOfLetter();
//        lettersInPosition();
//        String reversed = getStringReverse();
//        System.out.println("The reversed string is " + reversed);
//        boolean isWordIncluded = isWordIncluded("becir je sampion", "sampion");
//        sameWords();

        /*
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);
        System.out.println("The lengths of the Strings: " + lengths);
        */

        Scanner reader = new Scanner(System.in);
        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }

    /***
     * 1. Create the method average, which calculates the average of the numbers it gets as parameters.
     * Inside the method you should use the method sum as a helper!
     */
    public static double average(int number1, int number2, int number3, int number4) {
        int sum = calculateSum(number1, number2, number3, number4);
        double average = (double) sum / 4;

        return average;
    }

    public static int calculateSum(int number1, int number2, int number3, int number4) {
        int sum = 0;
        sum += number1;
        sum += number2;
        sum += number3;
        sum += number4;

        return sum;
    }

    /***
     * 2. Create a program that asks for the user's name and says how many characters the name contains.
     */
    public static void countNumOfLetter() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name");
        String name = reader.nextLine();
        System.out.println("Number of characters: " + name.length());
    }

    /***
     * 3. Create a program that asks for the user's name and gives its characters separately.
     */
    public static void lettersInPosition() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name");
        String name = reader.nextLine();
        int count = 1;
        while (count <= name.length()) {
            System.out.println(count + ". character " + name.charAt(count - 1));
            count++;
        }
    }

    /***
     * 4. Create a program that asks for the user's name and prints it in reverse order.
     */
    public static String getStringReverse() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name");
        String name = reader.nextLine();
        String reversedString = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversedString += name.charAt(i);
        }
        return reversedString;
    }

    /***
     * 5. Create a program that asks the user for two words. Then the program tells if the
     * second word is included in the first word. Use the String method indexOf in your program.
     */
    public static boolean isWordIncluded(String firstWord, String secondWord) {
        boolean firstResult = firstWord.contains(secondWord);
        int secondResult = firstWord.indexOf(secondWord);
        if (firstResult == true || secondResult != -1) {
            System.out.println("The word " + secondWord + " is found in word " + firstWord + " at index " + (secondResult + 1));
        } else {
            System.out.println("The word " + secondWord + " is not found in word " + firstWord);
        }
        return firstResult;
    }

    /***
     * 6. Create a program that asks the user to input words until the user gives the same word
     * twice. Use an ArrayList structure in your program. ArrayList is defined like this:
     *      ArrayList<String> words = new ArrayList<String>();
     * Print all words in alphabetical order.
     */
    public static void sameWords() {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        String userWord;
        while (true) {
            System.out.println("Type word");
            userWord = reader.nextLine();
            if (words.contains(userWord)) {
                break;
            } else {
                words.add(userWord);
            }
        }
        System.out.println("Words in alphabetical order are:");
        Collections.sort(words);
        for (String word : words) {
            System.out.println(word);
        }
    }

    /***
     * 7. Create the method lengths that gets a list of String variables as a parameter and
     * returns an ArrayList that contains the lengths of the Strings in the same order as
     * the original list.
     */

    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        for (String strings : list) {
            lengths.add(strings.length());
        }

        return lengths;
    }

    /***
     * 8. Create the method palindrome that checks if a string is a palindrome
     * (reads the same forward and backward)
     */

    public static boolean palindrome(String text) {
        int length = text.length();
        String reverse = "";
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        return text.equals(reverse);
    }
}
