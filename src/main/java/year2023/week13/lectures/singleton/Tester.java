package year2023.week13.lectures.singleton;

public class Tester {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance("becir");
        Singleton anotherInstance = Singleton.getInstance("Becir aga");

        if(s.equals(anotherInstance)){
            System.out.println("They are the same");
            System.out.println(s.toString());
            System.out.println(anotherInstance.toString());
        }
    }
}
