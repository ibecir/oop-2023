package week13.lectures.builder;

class Person {
    private String firstName;
    private String lastName;

    private int age;
    private int height;

    private Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.height = builder.height;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    //Builder Class
    public static class PersonBuilder {
        private String firstName;
        private String lastName;

        private int age;
        private int height;

        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }
}

class BuilderTest {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("Becir", "Isakovic")
                .setAge(15)
                .build();
        System.out.println(person.getAge());
    }
}
