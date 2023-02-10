package task054_Tasks.Core.MVP.Presenters.Actions;

import task054_Tasks.Core.MVP.Models.Task;
import task054_Tasks.Core.MVP.Presenters.Actions.Interfaces.ChangeActionInterface;
import task054_Tasks.Core.service.Tasks;

public class AddItemAction extends GetItemAction implements ChangeActionInterface {
    public AddItemAction(Tasks tasks) {
        super(tasks);
    }

    public Task GetTask() {
        int id = tasks.GetSize() + 1;
        System.out.println("Название задачи:");
        String name = scan.nextLine();
        System.out.println("Описание задачи:");
        String description = scan.nextLine();
        scan.close();

        return new Task(id, name, description);
    }

    public boolean RunChangeAction() {
        Task task = GetTask();
        if (tasks.AddTask(task)) {
            System.out.println("Новая добавленная задача:");
            taskView.ViewTask(task);
            return true;
        } else {
            System.out.println("Задачу добавить не удалось");
            return false;
        }
    }
}
