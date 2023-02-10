package task054_Tasks.Core.MVP.Models;

import java.util.HashMap;

public class Menu {
    private HashMap<Integer, String> menu = new HashMap<>();

    private void SetMenu() {
        menu.put(1, "Просмотреть список:");
        menu.put(2, "Просмотреть запись:");
        menu.put(3, "Добавить запись:");
        menu.put(4, "Редактировать запись:");
        menu.put(5, "Удалить запись:");
    }

    public HashMap<Integer, String> getMenu() {
        SetMenu();

        return menu;
    }
}
