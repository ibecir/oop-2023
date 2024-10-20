package year2023.week3.labs.db;

import java.sql.*;

public class DbConnect {
        private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/oop-lab3";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "";

        private Connection connection = null;

        public DbConnect() {
            try {
                connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public void getAllTasks() throws SQLException {
            PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM tasks");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("id"));
                System.out.println(rs.getString("task_description"));
                System.out.println(rs.getString("task_status"));
            }
        }

        public void getTaskById(int id) throws SQLException {
            PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM tasks WHERE id = ?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("id"));
                System.out.println(rs.getString("task_description"));
                System.out.println(rs.getString("task_status"));
            }
        }

    public void createTask(String taskDescription, String taskStatus) throws SQLException {
        String query = "INSERT INTO tasks (task_description, task_status) VALUES (?, ?)";
        PreparedStatement statement = this.connection.prepareStatement(query);

        statement.setString(1, taskDescription);
        statement.setString(2, taskStatus);

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new task was created successfully!");
        }
    }

    public void updateTaskNameById(int id, String newDescription) throws SQLException {
        String query = "UPDATE tasks SET task_description = ? WHERE id = ?";
        PreparedStatement statement = this.connection.prepareStatement(query);

        statement.setString(1, newDescription);
        statement.setInt(2, id);

        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Task with ID " + id + " was updated successfully!");
        } else {
            System.out.println("Task with ID " + id + " not found.");
        }
    }
}
