package sit707_week2;


import java.util.List;
import java.util.ArrayList;

public class TaskInbox {
    private List<String> tasks;

    public TaskInbox() {
        tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
    }
}
