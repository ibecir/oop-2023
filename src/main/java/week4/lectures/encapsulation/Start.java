package week4.lectures.encapsulation;

public class Start {
    public static void main(String[] args) {
        // Let us say there is a AccountBalance object created
        // and that the customer is trying to deposit
        // invalid amount for that account

        AccountBalance becir = new AccountBalance();
        becir.setBalance(-100000);
        System.out.println(becir.getBalance());
        AccountBalance a = new AccountBalance();
        // a.balance = -100; - This should not be allowed
        // To avoid it, we want to hide the param itself with the private keyword
        // and expose the attribute through the set and get methods in which
        // we can add the logic if needed

        // Now, the method implementation does not allow this
        // Information is hidden, the implementation does the job
        // Code is secure, the class is a capsule, to which
        // you can communicate via messages (the methods)
        a.setBalance(-100);
    }




}


