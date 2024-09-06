package year2023.week10.lectures.iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

class OddNumbersIterator implements Iterator<Integer> {
    private int[] elements;
    private int currentIndex = 0;

    public OddNumbersIterator(int[] elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < elements.length && elements[currentIndex] % 2 == 0) {
            currentIndex++;  // Skip even numbers
        }
        return currentIndex < elements.length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return elements[currentIndex++];
    }
}

class OddNumberIteratorMain{
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        OddNumbersIterator iterator = new OddNumbersIterator(numbers);
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}