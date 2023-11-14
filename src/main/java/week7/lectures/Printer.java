package week7.lectures;

import java.util.Arrays;
import java.util.List;

class Printer<T, K> {
    T thingtoPrint;
    K anotherThing;
}

class Wolf {

}

class Test {
    public static void main(String[] args) {
        Printer<Integer, Object> printer = new Printer<>();
        Printer<String, Wolf> printersecond = new Printer<>();
        Printer<Wolf, String> wolfPrinter = new Printer<>();

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        genericMethod(integerList);
    }

    public static <ANYTHING, T> void genericMethod(List<?> objectList) {
        for (Object o : objectList)
            System.out.println(o);
    }

}
