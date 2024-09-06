package year2023.week7.secondlivesession.finalkey;

abstract class AnimalC {
    private String name;

    public AnimalC(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String saySomething(String something);
}

class Fish extends AnimalC{

    public Fish(String name){
        super(name);
    }

    @Override
    public String saySomething(String something) {
        return something;
    }

    public static void main(String[] args) {
        System.out.println(FinalKeyword.NEMO_JE_HAVER);
    }
}

class FinalKeyword {
    public static final Fish NEMO_JE_HAVER = new Fish("Njegov jaran");;
    public static void main(String[] args) {
        System.out.println(NEMO_JE_HAVER);
    }
}
