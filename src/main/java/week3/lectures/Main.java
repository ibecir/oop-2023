package week3.lectures;

import week3.lectures.ds.DataStructures;
import week3.lectures.model.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataStructures ds = new DataStructures();
        List<User> users = ds.findAgeGreaterThan(13);

        for (User u : users){
            System.out.println(u.getName());
        }
    }
}
