package task054_Tasks.Core.MVP.Presenters;

import task054_Tasks.Core.MVP.Views.MenuView;

public class MenuPresenter {
    private MenuView menuView;

    public MenuPresenter() {
        this.menuView = new MenuView();
    }

    public void ShowMenu(boolean bool) {
        if (bool) {
            System.out.println(menuView.GetMenuStrIfEmptyList());
        } else {
            System.out.println(menuView.GetMenuStr());
        }
    }
}
