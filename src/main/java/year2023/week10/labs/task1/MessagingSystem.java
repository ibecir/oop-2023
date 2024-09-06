package year2023.week10.labs.task1;

public class MessagingSystem {
    @CanSendMessage
    @RequiresPermission(2)
    public void sendMessage(Admin user, String message) {
        System.out.println("Message sent by user " + user.getUsername() + ": " + message);
    }

    public void sendMessage(User user, String message) {
        System.out.println("Restricted");
    }

    public static void main(String[] args) {
        MessagingSystem messagingSystem = new MessagingSystem();

        User regularUser = new User("Lejla");
        Admin privilegedUser = new Admin ("Dino");

        messagingSystem.sendMessage(regularUser, "Hello!"); // Should be restricted
        messagingSystem.sendMessage(privilegedUser, "Hi there!"); // Should be allowed
    }
}
