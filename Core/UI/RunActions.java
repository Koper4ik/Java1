public class RunActions {
    private MenuPresenter menuPresenter;
    private FilePresenter filePresenter;
    private ActionReceiver actionReceiver; 

    public RunActions(FilePresenter filePresenter) {
        this.menuPresenter = new MenuPresenter();
        this.filePresenter = filePresenter;
    }

    public void RunAction(Tasks tasks) {
        menuPresenter.ShowMenu(false);
        this.actionReceiver = new ActionReceiver(tasks, filePresenter);

        try (Scanner in = new Scanner(System.in)) {

            if (in.hasNextInt()) {
                int menuPoint = in.nextInt();

                if (menuPoint == 1) {
                    actionReceiver.GetListAct();
                } else if (menuPoint == 2) {
                    actionReceiver.GetItemAct();
                } else if (menuPoint == 3) {
                    actionReceiver.AddItemAct();
                } else if (menuPoint == 4) {
                    actionReceiver.EditItemAct();
                } else if (menuPoint == 5) {
                    actionReceiver.RemoveItemAct();
                } else {
                    System.out.println("Неизвестная команда");
                }
            } else {
                System.out.println("Введено не число");
            }
        }
    }

    public void RunAddItemAction(Tasks tasks, boolean isEmpty) {
        if (isEmpty) {
            menuPresenter.ShowMenu(true);
        }
        actionReceiver.AddItemAct();
    }
}
