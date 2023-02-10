package task054_Tasks.Core.MVP.Presenters.Actions;

import task054_Tasks.Core.MVP.Models.Task;
import task054_Tasks.Core.MVP.Presenters.Actions.Interfaces.ChangeActionInterface;
import task054_Tasks.Core.service.Tasks;

public class EditItemAction extends GetItemAction implements ChangeActionInterface {
    public EditItemAction(Tasks tasks) {
        super(tasks);
    }

    public boolean RunChangeAction() {
        Task task = GetTask("Выберите задачу которую хотите отредактировать");
        String key = EditItemKey();

        if (key != "") {
            String val = EditItemVal();
            if (tasks.EditTask(task, key, val)) {
                System.out.println("Отредактированная задача:");
                taskView.ViewTask(task);
                return true;
            } else {
                System.out.println("Задачу обновить не удалось");
                return false;
            }
        } else {
            return false;
        }
    }

    public String EditItemKey() {
        String key = "";

        System.out.println("Выберите какое поле вы хотите отредактировать: 1 - название, 2 - описание:");

        if (scan.hasNextInt()) {
            int num = scan.nextInt();
            if (num == 1) {
                key = "name";
            } else if (num == 2) {
                key = "description";
            } else {
                System.out.println("Поле не найдено");
            }
        } else {
            System.out.println("Введено не число");
        }

        return key;
    }

    public String EditItemVal() {
        String str = "";
        scan.nextLine();
        System.out.println("Введите новое значение поля:");
        if (scan.hasNextLine()) {
            str = scan.nextLine();
        } else {
            System.out.println("Значение не введено");
        }
        scan.close();

        return str;
    }
}
