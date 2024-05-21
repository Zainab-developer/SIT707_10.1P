package sit707_week2;


import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class TaskInboxTest {

    @Test
    public void testInitialTasks() {
        TaskInbox inbox = new TaskInbox();
        List<String> tasks = inbox.getTasks();
        Assert.assertTrue("Initial tasks list should be empty", tasks.isEmpty());
    }

    @Test
    public void testAddTask() {
        TaskInbox inbox = new TaskInbox();
        String task = "Task 1";
        inbox.addTask(task);
        List<String> tasks = inbox.getTasks();
        Assert.assertEquals("Number of tasks should be 1", 1, tasks.size());
        Assert.assertEquals("Task should be added correctly", task, tasks.get(0));
    }

    @Test
    public void testMultipleTasks() {
        TaskInbox inbox = new TaskInbox();
        inbox.addTask("Task 1");
        inbox.addTask("Task 2");
        inbox.addTask("Task 3");
        List<String> tasks = inbox.getTasks();
        Assert.assertEquals("Number of tasks should be 3", 3, tasks.size());
    }
}

