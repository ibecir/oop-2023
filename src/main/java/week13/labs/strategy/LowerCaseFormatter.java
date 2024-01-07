package week13.labs.strategy;

public class LowerCaseFormatter  implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}