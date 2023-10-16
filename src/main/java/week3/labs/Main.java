package week3.labs;

import week3.labs.model.TaskItem;
import week3.labs.db.DbConnect;
import week3.labs.ds.DataStructures;
import week3.lectures.model.User;


import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws SQLException {
        DataStructures ds = new DataStructures();

        List<TaskItem> allTasks = ds.getAllObjects();
        System.out.println("-- task 1 --");
        System.out.println("All tasks:");
        for (TaskItem task : allTasks) {
            System.out.println(task.getDescription());
            System.out.println(task.getStatus());
        }
        System.out.println("-- task 2 --");
        Optional<TaskItem> task = ds.getByStatus("TO_DO");
        if (task.isPresent()) {
            System.out.println("TO_DO: " + task.get().getDescription());
        } else {
            System.out.println("No task found with status 'TO_DO'");
        }
        System.out.println("-- task 3 --");
        List<TaskItem> taskItem = ds.findIdGrater(2);
        for (TaskItem u : taskItem) {
            System.out.println(u.getId());
            System.out.println(u.getDescription());
            System.out.println(u.getStatus());
        }

        System.out.println("-- task 4 --");
        ds.printTaskDescriptions();


        System.out.println("DATABASE TASKS : ");
        DbConnect db = new DbConnect();
        db.getTaskById(2);
        db.getAllTasks();
    }
}
