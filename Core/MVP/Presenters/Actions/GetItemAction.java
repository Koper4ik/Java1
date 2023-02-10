package task054_Tasks.Core.MVP.Presenters.Actions;

import task054_Tasks.Core.MVP.Models.Task;
import task054_Tasks.Core.MVP.Presenters.ActionPresenter;
import task054_Tasks.Core.MVP.Presenters.Actions.Interfaces.GetActionInterface;
import task054_Tasks.Core.service.Tasks;

public class GetItemAction extends ActionPresenter implements GetActionInterface {
    public GetItemAction(Tasks tasks) {
        super(tasks);
    }

    public void RunAction() {
        GetTask("Какую задачу хотите посмотреть: ");
    }

    public Task GetTask(String message) {
        System.out.println(message);

        if (scan.hasNextInt()) {
            int num = scan.nextInt();

            if (tasks.GetTask(num) != null) {
                Task task = tasks.GetTask(num);
                taskView.ViewTask(task);
                return task;
            } else {
                System.out.println("Задача не найдена");
                return null;
            }
        } else {
            System.out.println("Введено не число");
            return null;
        }
    }
}
