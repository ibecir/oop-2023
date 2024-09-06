package year2023.week13.labs.state;

public class TrafficLightController {
    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();

        // Simulating traffic light transitions
        context.transitionToGreen();
        context.transitionToYellow();
        context.transitionToRed();
        context.transitionToRed(); // Stays in Red state
        context.transitionToGreen();
    }
}
