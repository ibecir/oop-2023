package year2023.week7.lectures.optionals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

record Human(String name, int age) {
}

class OptionalsExample {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Becir", 29),
                new Human("Adnan", 35)
        );

        Optional<Human> human = Optional.of(new Human("Becir", 29));
        Human humanNullable = Optional
                .ofNullable(new Human("Becir", 29))
                .orElse(null);

        String name = (String) Optional
                .ofNullable(null)
                .orElseGet(() -> "Becir");

        Optional<Human> humanOptional = humans
                .stream()
                .filter(humanFilter -> humanFilter.name().equals("Becir"))
                .findFirst();
    }
}
