package week7.secondlivesession.lambdafinterfaces;

@FunctionalInterface
interface OperationInterface {
    int operation(int a, int b);
}

@FunctionalInterface
interface MessageInterface {
    String saySomething(String something);
}

class TestTheLambdas{

    public static void main(String[] args) {
        //OperationInterface sumOperationInterface = (int a, int b)


        OperationInterface sumOperation = (int first, int second) -> first + second;

        OperationInterface divideOperation = (int first, int second) -> first / second;

        System.out.println(operateTheOperation(10, 5, sumOperation));
        System.out.println(operateTheOperation(10, 5, divideOperation));
    }

    public static int operateTheOperation(int x, int y, OperationInterface instance){
        return instance.operation(x, y);
    }

}
