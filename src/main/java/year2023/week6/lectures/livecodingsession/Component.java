package year2023.week6.lectures.livecodingsession;

public class Component {
    private String serialNo;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public void say(){
        System.out.println("Component said something");
    }
}
