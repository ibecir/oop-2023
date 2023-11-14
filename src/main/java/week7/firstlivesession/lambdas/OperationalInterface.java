package week7.firstlivesession.lambdas;

@FunctionalInterface
interface OperationalInterface {
    int operation(int a, int b);
}

@FunctionalInterface
interface MessageInterface{
    String sayHello(String message);
}
