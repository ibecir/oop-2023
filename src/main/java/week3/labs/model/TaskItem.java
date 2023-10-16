package week3.labs.model;

import week3.labs.enums.taskStatus;


public class TaskItem {
    private int id;
    private String description;
    private taskStatus status;


    public TaskItem(int id, String description, taskStatus status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public taskStatus getStatus() {
        return status;
    }

    public void setStatus(taskStatus status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
