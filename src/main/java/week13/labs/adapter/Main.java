package week13.labs.adapter;

public class Main {
    public static void main(String[] args) {
        testDeviceAdapter();
    }

    private static void testDeviceAdapter() {
        OldDevice oldDevice = new OldDeviceImpl();
        NewDevice adapter = new DeviceAdapter(oldDevice);

        adapter.performNewAction(2, "Complex action");
        adapter.performNewAction(1,"something");
    }
}
