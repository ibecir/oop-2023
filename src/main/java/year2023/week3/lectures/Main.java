package year2023.week3.lectures;

import year2023.week3.lectures.db.DbConnect;
import year2023.week3.lectures.ds.DataStructures;
import year2023.week3.lectures.model.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        DataStructures ds = new DataStructures();
        List<User> users = ds.findAgeGreaterThan(13);

        for (User u : users) {
            System.out.println(u.getName());
        }

        DbConnect db = new DbConnect();
        db.getAllCustomers();
        db.getCustomerById(103);
    }
}
