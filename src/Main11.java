// I used Prettier extension so i didnt allign all of these
import java.util.*;

public class Main11 {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("X", "Y", "Z", "W");
        List<String> mergedList = mergeLists(list1, list2);
        System.out.println("Merged List: " + mergedList);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        printMap(map);

        TaskScheduler scheduler = new TaskScheduler();

        System.out.println("Tasks Added:");
        Task task1 = new Task("Code Review", 3, 20);
        Task task2 = new Task("System Update", 5, 45);
        Task task3 = new Task("Database Backup", 2, 30);
        Task task4 = new Task("Deploy New Feature", 5, 50);
        Task task5 = new Task("Bug Fixing", 4, 25);

        scheduler.addTask(task1);
        scheduler.addTask(task2);
        scheduler.addTask(task3);
        scheduler.addTask(task4);
        scheduler.addTask(task5);

        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);
        System.out.println(task4);
        System.out.println(task5);
        System.out.println();

        System.out.println("Scheduled Tasks (sorted by priority): ");
        scheduler.displayScheduledTasks();
        System.out.println();

        scheduler.processHighestPriorityTask();

        scheduler.delayTask("Code Review");
        System.out.println();

        System.out.println("Scheduled Tasks (sorted by priority): ");
        scheduler.displayScheduledTasks();
        System.out.println("Pending Tasks (FIFO Order): ");
        scheduler.displayPendingTasks();
        System.out.println();

        scheduler.delayTask("Database Backup");
        System.out.println();

        System.out.println("Scheduled Tasks (sorted by priority): ");
        scheduler.displayScheduledTasks();
        System.out.println("Pending Tasks (FIFO Order): ");
        scheduler.displayPendingTasks();
        System.out.println();

        scheduler.processHighestPriorityTask();
        System.out.println();

        System.out.println("Scheduled Tasks (sorted by priority): ");
        scheduler.displayScheduledTasks();
        System.out.println("Pending Tasks (FIFO Order): ");
        scheduler.displayPendingTasks();
        System.out.println();

        scheduler.processHighestPriorityTask();
        System.out.println();

        System.out.println("Scheduled Tasks (sorted by priority): ");
        scheduler.displayScheduledTasks();
        System.out.println("Pending Tasks (FIFO Order): ");
        scheduler.displayPendingTasks();
        System.out.println();

        scheduler.processNextTask();
        System.out.println();

        System.out.println("Scheduled Tasks (sorted by priority): ");
        scheduler.displayScheduledTasks();
        System.out.println("Pending Tasks (FIFO Order): ");
        scheduler.displayPendingTasks();
        System.out.println();

        scheduler.processNextTask();
        System.out.println();

        System.out.println("Scheduled Tasks (sorted by priority): ");
        scheduler.displayScheduledTasks();
        System.out.println("Pending Tasks (FIFO Order): ");
        scheduler.displayPendingTasks();
    }

    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        int maxSize = Math.max(list1.size(), list2.size());

        for (int i = 0; i < maxSize; i++) {
            if (i < list1.size()) {
                result.add(list1.get(i));
            }
            if (i < list2.size()) {
                result.add(list2.get(i));
            }
        }

        return result;
    }

    public static <K, V> void printMap(Map<K, V> map) {
        System.out.println("Map contents:");
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println();
    }
}

class Task implements Comparable<Task> {

    private String taskName;
    private int priority;
    private int duration;

    public Task(String taskName, int priority, int duration) {
        this.taskName = taskName;
        this.priority = priority;
        this.duration = duration;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getPriority() {
        return priority;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public int compareTo(Task other) {
        int priorityComparison = Integer.compare(other.priority, this.priority);
        if (priorityComparison != 0) {
            return priorityComparison;
        }

        return Integer.compare(this.duration, other.duration);
    }

    @Override
    public String toString() {
        return "[Priority " + priority + "] " + taskName + " (Duration: " + duration + " mins)";
    }
}

class TaskScheduler {

    private PriorityQueue<Task> scheduledTasks;
    private Queue<Task> pendingTasks;

    public TaskScheduler() {
        scheduledTasks = new PriorityQueue<>();
        pendingTasks = new LinkedList<>();
    }

    public void addTask(Task task) {
        scheduledTasks.add(task);
    }

    public void processHighestPriorityTask() {
        if (!scheduledTasks.isEmpty()) {
            Task task = scheduledTasks.poll();
            System.out.println("Processing Task: " + task);
        } else {
            System.out.println("No tasks to process.");
        }
    }

    public void delayTask(String taskName) {
        Task taskToDelay = null;

        PriorityQueue<Task> temp = new PriorityQueue<>();

        while (!scheduledTasks.isEmpty()) {
            Task task = scheduledTasks.poll();
            if (task.getTaskName().equals(taskName) && taskToDelay == null) {
                taskToDelay = task;
            } else {
                temp.add(task);
            }
        }

        scheduledTasks = temp;

        if (taskToDelay != null) {
            pendingTasks.add(taskToDelay);
            System.out.println("Delaying Task: " + taskToDelay.getTaskName());
        } else {
            System.out.println("Task not found: " + taskName);
        }
    }

    public void processNextTask() {
        if (!scheduledTasks.isEmpty()) {
            processHighestPriorityTask();
        } else if (!pendingTasks.isEmpty()) {
            Task task = pendingTasks.poll();
            System.out.println("Processing Task: [Priority " + task.getPriority() + "] "
                    + task.getTaskName() + " (Duration: " + task.getDuration() + " mins)");
        } else {
            System.out.println("No tasks to process.");
        }
    }

    public void displayScheduledTasks() {
        if (scheduledTasks.isEmpty()) {
            System.out.println("(No priority tasks)");
            return;
        }

        PriorityQueue<Task> tempQueue = new PriorityQueue<>(scheduledTasks);
        int count = 1;

        while (!tempQueue.isEmpty()) {
            System.out.println(count + ". " + tempQueue.poll());
            count++;
        }
    }

    public void displayPendingTasks() {
        if (pendingTasks.isEmpty()) {
            System.out.println("(No pending tasks)");
            return;
        }

        Queue<Task> tempQueue = new LinkedList<>(pendingTasks);
        int count = 1;

        while (!tempQueue.isEmpty()) {
            Task task = tempQueue.poll();
            System.out.println(count + ". " + task.getTaskName()
                    + " (Priority: " + task.getPriority()
                    + ", Duration: " + task.getDuration() + " mins)");
            count++;
        }
    }
}
