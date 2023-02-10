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
