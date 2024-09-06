package year2023.week6.lectures.labs;

public class StringUtils {
    public static boolean included(String word, String searched){
        word = word.toUpperCase();
        searched = searched.toUpperCase();
        return word.contains(searched);
    }
}
