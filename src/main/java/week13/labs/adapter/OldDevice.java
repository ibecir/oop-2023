package week13.labs.adapter;

interface OldDevice {
    void performOldAction(String action);
}

interface NewDevice {
    void performNewAction(int level, String action);
}

// Device Implementations
class OldDeviceImpl implements OldDevice {
    public void performOldAction(String action) {
        System.out.println("Performing old action: " + action);
    }
}

class NewDeviceImpl implements NewDevice {
    public void performNewAction(int level, String action) {
        System.out.println("Performing new action at level " + level + ": " + action);
    }
}

// Adapter Implementation
class DeviceAdapter implements NewDevice {
    private OldDevice oldDevice;

    public DeviceAdapter(OldDevice oldDevice) {
        this.oldDevice = oldDevice;
    }

    public void performNewAction(int level, String action) {
        System.out.println("Adapter translating to the new method at level " + level);
        oldDevice.performOldAction(action);
    }
}


