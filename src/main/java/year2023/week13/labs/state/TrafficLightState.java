package year2023.week13.labs.state;

interface TrafficLightState {
    void transitionToRed();
    void transitionToGreen();
    void transitionToYellow();
}

class RedLightState implements TrafficLightState {
    @Override
    public void transitionToRed() {
        System.out.println("Already in RED state");
    }

    @Override
    public void transitionToGreen() {
        System.out.println("Switching to GREEN state");
    }

    @Override
    public void transitionToYellow() {
        System.out.println("Switching to YELLOW state");
    }
}

// Yellow Light State
class YellowLightState implements TrafficLightState {
    @Override
    public void transitionToRed() {
        System.out.println("Switching to RED state");
    }

    @Override
    public void transitionToGreen() {
        System.out.println("Switching to GREEN state");
    }

    @Override
    public void transitionToYellow() {
        System.out.println("Already in YELLOW state");
    }
}

class GreenLightState implements TrafficLightState {
    @Override
    public void transitionToRed() {
        System.out.println("Switching to RED state");
    }

    @Override
    public void transitionToGreen() {
        System.out.println("Already in GREEN state");
    }

    @Override
    public void transitionToYellow() {
        System.out.println("Switching to YELLOW state");
    }
}

class TrafficLightContext {
    private TrafficLightState state;

    public TrafficLightContext() {
        this.state = new RedLightState(); // Initial state is Red
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void transitionToRed() {
        state.transitionToRed();
    }

    public void transitionToGreen() {
        state.transitionToGreen();
    }

    public void transitionToYellow() {
        state.transitionToYellow();
    }
}
