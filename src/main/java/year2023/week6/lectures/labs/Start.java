package year2023.week6.lectures.labs;

import java.util.*;

public class Start {
    public static void main(String[] args) {

//        int[] values  = {-1,6, 9, 8, 12};
//        System.out.println(Task1.smallest(values));
//        System.out.println(Task2.indexOfSmallest(values));
//        System.out.println(Task3.indexOfTheSmallestStartingFrom(values, 1));
//        System.out.println(Task3.indexOfTheSmallestStartingFrom(values, 2));
//        System.out.println(Task3.indexOfTheSmallestStartingFrom(values, 4));
//
//        System.out.println("Before Swap: " + Arrays.toString(values));
//        Task4.swap(values, 1, 0);
//        System.out.println("After 1. Swap: " + Arrays.toString(values));
//        Task4.swap(values, 0, 3);
//        System.out.println("After 2. Swap: " + Arrays.toString(values));
//
//        int[] array = { -3, 2, 3, 4, 7, 8, 12 };
//
//        Scanner reader = new Scanner(System.in);
//
//        System.out.print("Values of the array: " + Arrays.toString(array));
//        System.out.println();
//        System.out.print("Enter searched number: ");
//        String searchedValue = reader.nextLine();
//        System.out.println();
//        int result = BinarySearch.search(array,  0, array.length, Integer.parseInt(searchedValue));
//
//        if(result == -1){
//            System.out.println("Value : " + searchedValue + " is not in the array");
//        }else{
//            System.out.println("Value : " + searchedValue + " is in the array");
//        }
//
//        int[] array3 = {5, 1, 3, 4, 2};
//        Task6.printElegantly(array3);
//
//        NightSky NightSky = new NightSky(0.1, 40, 10);
//        NightSky.print();
//        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
//        System.out.println("");
//
//
//        NightSky = new NightSky(0.2, 15, 6);
//        NightSky.print();
//        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
//
//        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
//        System.out.println(cheese.title());
//        System.out.println(cheese.publisher());
//        System.out.println(cheese.year());
//
//        System.out.println(cheese);
//
//        Book nh1 = new Book("NHL Hockey", "Stanley Cup", 1952);
//
//        Library l = new Library();
//        l.addBook(cheese);
//        l.addBook(nh1);
//        l.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
//        l.addBook(new Book("Cheese Man", "Penguin Group", 1992));
//
//        l.printBooks();
//
//        ArrayList<Book> result = Library.searchByTitle("CHEESE");
//        System.out.println("========");
//        for(Book b : result){
//            System.out.println(b);
//        }
//
        HashMap<String, String> names = new HashMap<String, String>();

        names.put("matt", "mage");
        names.put("mikael", "mixu");
        names.put("arto", "arppa");

        System.out.println(names.get("mikael"));


        PromissoryNote mattisNote = new PromissoryNote();

        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);
        mattisNote.setLoan("Arto", 11.5);

        System.out.println(mattisNote.howMuchIsDebt("Arto"));
        System.out.println(mattisNote.howMuchIsDebt("Joel"));

        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));

        System.out.println(dictionary.amountOfWords());

        ArrayList<String> translations = dictionary.translationList();

        for(String translation: translations){
            System.out.println(translation);
        }

        String input = "translate\n" + "monkey\n"  +
                    "translate\n" + "cheese\n" +
                    "add\n"  + "cheese\n" + "juusto\n" +
                    "translate\n" + "cheese\n" +
                    "quit\n";

        Scanner reader = new Scanner(input);
        Dictionary dictionary2 = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dictionary2);
        ui.start();

        List< Integer > integers = List.of(1, 2, 3, 4, 5, 6, 7);
        List < Double > doubles = List.of(2.0, 1.5, 4.5, 2.5, 1.5);

        sumOddEven.calculateNumberSum(integers);
        sumOddEven.calculateNumberSum(doubles);

        List < Integer > numbers = List.of(1, 2, 3, 4, 5, 6);
        List < String > colors = List.of("Red", "Green", "Orange");

        List < Integer > reversedNumbers = ReversedList.reverseList(numbers);
        System.out.println("Original list of numbers: " + numbers);
        System.out.println("Reversed numbers: " + reversedNumbers);

        List < String > reversedWords = ReversedList.reverseList(colors);
        System.out.println("\nOriginal list of colors: " + colors);
        System.out.println("Reversed colors: " + reversedWords);
    }
}