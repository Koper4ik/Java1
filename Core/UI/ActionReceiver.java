package task054_Tasks.UI;

import task054_Tasks.Core.MVP.Presenters.FilePresenter;
import task054_Tasks.Core.MVP.Presenters.Actions.AddItemAction;
import task054_Tasks.Core.MVP.Presenters.Actions.GetItemAction;
import task054_Tasks.Core.MVP.Presenters.Actions.GetListAction;
import task054_Tasks.Core.MVP.Presenters.Actions.EditItemAction;
import task054_Tasks.Core.MVP.Presenters.Actions.RemoveItemAction;
import task054_Tasks.Core.service.Tasks;

public class ActionReceiver {
    private Tasks tasks;
    private FilePresenter filePresenter;

    public ActionReceiver(Tasks tasks, FilePresenter filePresenter) {
        this.tasks = tasks;
        this.filePresenter = filePresenter;
    }

    public void GetListAct() {
        GetListAction getListAction = new GetListAction(tasks);
        getListAction.RunAction();
    }

    public void GetItemAct() {
        GetItemAction getItemAction = new GetItemAction(tasks);
        getItemAction.RunAction();
    }

    public void AddItemAct() {
        AddItemAction addItemAction = new AddItemAction(tasks);

        if (addItemAction.RunChangeAction()) {
            filePresenter.WriteFile(tasks);
        }
    }

    public void EditItemAct() {
        EditItemAction editItemAction = new EditItemAction(tasks);

        if (editItemAction.RunChangeAction()) {
            filePresenter.WriteFile(tasks);
        }
    }

    public void RemoveItemAct() {
        RemoveItemAction removeItemAction = new RemoveItemAction(tasks);

        if (removeItemAction.RunChangeAction()) {
            filePresenter.WriteFile(tasks);
        }
    }
}
