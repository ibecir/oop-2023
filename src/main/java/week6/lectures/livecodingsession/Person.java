package week6.lectures.livecodingsession;

class Person {
    private static int counter;
    private String name;

    public Person(String name) {
        counter++;
        this.name = name;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Person.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class DeleteMe{
    public static void main(String[] args) {
        Person becir = new Person("Becir");
        System.out.println(becir.getName());
        System.out.println(Person.getCounter());

        Person basar = new Person("Basar bey");
        System.out.println(basar.getName());
        System.out.println(Person.getCounter());
    }
}
