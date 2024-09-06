package year2023.week6.lectures.labs;

import java.util.ArrayList;
import java.util.List;

public class ReversedList {

    public static < T > List < T > reverseList(List < T > originalList) {
        List < T > reversedList = new ArrayList < > ();

        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }

        return reversedList;
    }
}