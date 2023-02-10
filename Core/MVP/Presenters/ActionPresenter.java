package task054_Tasks.Core.MVP.Presenters;

import java.util.Scanner;

import task054_Tasks.Core.MVP.Views.TaskView;
import task054_Tasks.Core.service.Tasks;

public abstract class ActionPresenter {
    protected Tasks tasks;
    protected Scanner scan;
    protected TaskView taskView;

    public ActionPresenter(Tasks tasks) {
        this.tasks = tasks;
        this.scan = new Scanner(System.in);
        this.taskView = new TaskView();
    }
}
