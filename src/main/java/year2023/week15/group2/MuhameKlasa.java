package year2023.week15.group2;

public class MuhameKlasa {
    private String name;
    private int age;

    public MuhameKlasa(MuhameKlasaBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public static class MuhameKlasaBuilder {
        private String name;
        private int age;

        public MuhameKlasaBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public MuhameKlasaBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public MuhameKlasa build(){
            return new MuhameKlasa(this);
        }
    }
}
