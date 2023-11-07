package week6.lectures.livecoding;

class StringPrinter {
    private String name;

    public StringPrinter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void print(){
        System.out.println(this.name);
    }
}

class IntegerPrinter {
    private int param;

    public IntegerPrinter(int param) {
        this.param = param;
    }

    public int getParam() {
        return param;
    }

    public void setParam(int param) {
        this.param = param;
    }

    private void print(){
        System.out.println(this.param);
    }
}
