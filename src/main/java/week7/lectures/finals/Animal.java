package week7.lectures.finals;

// The final class cannot be extended
class Animal {
    // If we make method final we cannot override it
    public void eat() {
        System.out.println("Eating");
    }
}

class Lion extends Animal {
    @Override
    public void eat() {
        super.eat();
    }
}

class Wolf extends Animal {

}

class RunMe {

    public static final double PI_MULTIPLE_KEYWORDS = 3.1;

    public static void main(String[] args) {
        // If we have a final variable, that variable value can only be set once
        final Wolf wolf;
        wolf = new Wolf();
    }
}
