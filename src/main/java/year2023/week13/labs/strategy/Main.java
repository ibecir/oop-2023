package year2023.week13.labs.strategy;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        // Set UpperCaseFormatter
        textEditor.setFormatter(new UpperCaseFormatter());
        System.out.println(textEditor.formatText("Hello, Strategy Pattern!"));

        // Set LowerCaseFormatter
        textEditor.setFormatter(new LowerCaseFormatter());
        System.out.println(textEditor.formatText("Hello, Strategy Pattern!"));

        // Set CamelCaseFormatter
        textEditor.setFormatter(new CamelCaseFormatter());
        System.out.println(textEditor.formatText("Hello, Strategy Pattern!"));
    }
}
