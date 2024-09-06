package year2023.week7.lectures.optionals;

import java.util.Optional;

record Wolf(String name, int age) { }

// We use optional, so we say to user who calls the method that it can be empty
// They can be used as any other object but their intent is to be used as a return type
class StartMe {
    public static void main(String[] args) throws ClassNotFoundException {
        Wolf wolf = getWolfByName("Strasni");
        // System.out.println(wolf.age()); // Return an exception, common situation

        if(wolf != null)
            System.out.println(wolf.age());
        else
            System.out.println("No wolf");

        Optional<Wolf> wolfOptional = getWolfByNameOptional("Strasni");
        if(wolfOptional.isPresent())
            System.out.println(wolfOptional.get().age());
        else if(wolfOptional.isEmpty())
            System.out.println("NO VALUE IN IT");

        System.out.println(wolfOptional.orElse(new Wolf("Neka nova vucina", 11)));

        System.out.println(wolfOptional.orElseGet(() -> null));

        wolfOptional.orElseThrow(ClassNotFoundException::new);

        wolfOptional.map(Wolf::age)
                .orElse(0);
    }

    public static Wolf getWolfByName(String name){
        // return new Wolf("Strasni vuk", 12);
        // What if the wolf does not exits?
        return null;
    }

    public static Optional<Wolf> getWolfByNameOptional(String name){
        return Optional.ofNullable(null);
    }

    public static Optional<Wolf> tgetWolfByNameOptional(String name){
        // Optional.empty() if you want to create empty Optional
        return Optional.ofNullable(new Wolf("Strasni vuk", 12)); // Optional.of if you know sure that that will not bu null
    }
}