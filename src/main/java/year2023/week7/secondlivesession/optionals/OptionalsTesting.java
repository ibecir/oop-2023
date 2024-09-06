package year2023.week7.secondlivesession.optionals;

import java.util.Optional;

record Elephant(String name, int age) {
};

class OptionalsTesting {

    public static void main(String[] args) throws ClassNotFoundException {
        Optional<Elephant> e = getElephant();

        if (e.isPresent())
            System.out.println(e.get().age());
        else if (e.isEmpty())
            System.out.println("No elephant");

        Elephant slon = e.orElseThrow(ClassNotFoundException::new);
    }

    public static Optional<Elephant> getElephant() {
        return Optional.ofNullable(null);
    }

}
