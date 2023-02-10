package task054_Tasks.Core.MVP.Views;

import task054_Tasks.Core.MVP.Models.Task;

public class TaskView {
    public void ViewTask(Task task) {
        System.out.println(task);
    }

    public void ViewTasks(String tasks) {
        if (tasks != "") {
            System.out.println(tasks);
        } else {
            System.out.println("Задачи не найдены");
        }
    }
}
