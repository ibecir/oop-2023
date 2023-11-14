package week7.firstlivesession.lambdas;

public class TestingFunctionalInterface{public static void main(String[] args) {
        OperationalInterface sumOperation = (int x, int y) -> x + y;

        OperationalInterface multipyOperation = (int x, int y) -> {
            System.out.println("I'm a programming beast");
            return x * y;
        };

        MessageInterface messageInterface = message -> "Hello ".concat(message);

        MessageInterface messageInterfaceSecond = (message) -> {
            return "Hello ".concat(message);
        };

    System.out.println(doAOperation(10, 15, sumOperation));
    System.out.println(doAOperation(10, 15, multipyOperation));
    }

    public static int doAOperation(int a, int b, OperationalInterface object) {
        return object.operation(a, b);
    }
}
