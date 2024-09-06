package year2023.week3.labs.ds;

import year2023.week3.labs.enums.TaskStatus;
import year2023.week3.labs.model.TaskItem;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DataStructures {
    private List<TaskItem> tasks;

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1,"Push lab code to the github", TaskStatus.TO_DO),
                new TaskItem(2, "Prepare for the quiz", TaskStatus.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from Lab2", TaskStatus.COMPLETED),
                new TaskItem(4, "Night out", TaskStatus.CANCELLED));
    }
    //create a method to get all objects
    public List<TaskItem> getAllObjects() {
        return this.tasks;
    }

    //create a method getByStatus that will accept a Status parameter and filter the tasks with the provided status
    public Optional<TaskItem> getByStatus(String status) {
        TaskStatus desiredStatus = TaskStatus.valueOf(status.toUpperCase());
        return tasks
                .stream()
                .filter(taskItem -> {
                    return taskItem.getStatus().equals(desiredStatus);
                }).findFirst();
    }
    // create a method that will, by using the forEach stream method,
    // print to the console the description of each task
    public void printTaskDescriptions() {
        tasks.stream()
                .forEach(taskItem -> System.out.println(taskItem.getDescription()));
    }
    // create a method to find tasks whose id parameter greater than or equal to 2
    public List<TaskItem> findIdGrater(int id) {
        return tasks
                .stream()
                .filter(taskItem -> taskItem.getId() >= id)
                .toList();
    }
}
