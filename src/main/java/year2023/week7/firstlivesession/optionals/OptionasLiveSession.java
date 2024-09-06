package year2023.week7.firstlivesession.optionals;

import java.util.Optional;

class OptionasLiveSession {

    public static void main(String[] args) throws ClassNotFoundException {
        Optional<Donkey> mojeMagare = getDoney();

        if(mojeMagare.isPresent())
            System.out.println(mojeMagare.get().name());
        else
            System.out.println("Nema magareta");

        Donkey donkey = getDoney()
                .orElse(new Donkey("Magare novo"));

        System.out.println(donkey.name());

        Donkey donkey1 = getDoney().orElseThrow(ClassNotFoundException::new);
    }

    private static Optional<Donkey> getDoney(){
        return Optional.ofNullable(null);
    }

}

record Donkey(String name){};
