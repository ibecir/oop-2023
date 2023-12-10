package week11.lectures.exceptions;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int numberParsed = getParsedInt("myInt");
            System.out.println("This will not be written to the console");
        } catch (NumberFormatException nfe){
            System.out.println("Unable to cast string to integer");
        } catch (NullPointerException npe) {
            System.out.println("The NullPointer has been thrown");
        } finally {
            System.out.println("I'm always executed");
        }
    }

    public static int getParsedInt(String stringNumber){
        int numberParsed = Integer.parseInt(stringNumber);
        return numberParsed;
    }

    public static int multiCatchParse(String stringNumer) {
        try {
            int numberParsed = getParsedInt("myInt");
            return numberParsed;
        } catch (NumberFormatException | NullPointerException e){
            System.out.println("Problem happened");
        }
        return 0;
    }

    public static int finallyExample(){
        try {
            return 1;
        } catch (Exception e){
            return 2;
        } finally {
            return 3;
        }
    }
}
