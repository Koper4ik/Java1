package task054_Tasks.Core.MVP.Presenters.Actions;

import task054_Tasks.Core.MVP.Models.Task;
import task054_Tasks.Core.MVP.Presenters.Actions.Interfaces.ChangeActionInterface;
import task054_Tasks.Core.service.Tasks;

public class RemoveItemAction extends GetItemAction implements ChangeActionInterface {
    public RemoveItemAction(Tasks tasks) {
        super(tasks);
    }

    public boolean RunChangeAction() {
        Task task = GetTask("Выберите задание которое хотите удалить:");

        if (tasks.RemoveTask(task)) {
            System.out.println("Список оставшихся задач:");
            taskView.ViewTasks(tasks.GetTasks());
            return true;
        } else {
            System.out.println("Задачу удалить не удалось");
            return false;
        }
    }
}
