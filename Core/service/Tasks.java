package task054_Tasks.Core.service;

import java.util.ArrayList;

import task054_Tasks.Core.MVP.Models.Task;

public class Tasks {
    private ArrayList<Task> tasks;

    public Tasks() {
        this.tasks = new ArrayList<Task>();
    }

    public boolean checkEmpty() {
        if (tasks.isEmpty()) {
            return true;
        }

        return false;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public int GetSize() {
        return tasks.size();
    }

    public String GetTasks() {
        String str = "";

        for (Task el : tasks) {
            str += el + " \n\n";
        }

        return str;
    }

    public Task GetTask(int id) {
        for (Task p : tasks) {
            if (p.getId() == id) {
                return p;
            }
        }

        return null;
    }

    public boolean AddTask(Task task) {
        boolean flag = false;

        if (!tasks.contains(task)) {
            tasks.add(task);
            flag = true;
        }

        return flag;
    }

    public boolean EditTask(Task task, String key, String value) {
        if (value != "") {
            if (key == "name") {
                task.setName(value);
                return true;
            } else if (key == "description") {
                task.setDescription(value);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean RemoveTask(Task task) {
        boolean flag = false;

        if (task != null) {
            tasks.remove(task);
            flag = true;
        }

        return flag;
    }
}
