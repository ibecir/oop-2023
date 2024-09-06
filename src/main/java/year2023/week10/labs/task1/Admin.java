package year2023.week10.labs.task1;

@UserPermission(value = 2)
public class Admin {
    private String username;

    public Admin(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
