package week10.labs.task1;

@UserPermission(value = 1)
public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
