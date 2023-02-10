package task054_Tasks.Core.MVP.Views;

import java.util.HashMap;
import java.util.StringJoiner;

import task054_Tasks.Core.MVP.Models.Menu;

public class MenuView {
    public StringBuilder GetMenuStr() {
        StringBuilder str = new StringBuilder();
        str.append("Выберите одну из функций программы\n");

        StringJoiner strJoin = new StringJoiner("\n");
        Menu menu = new Menu();
        HashMap<Integer, String> menuList = menu.getMenu();

        for (var entry : menuList.entrySet()) {
            strJoin.add(entry.getKey() + " - " + entry.getValue());
        }

        str.append(strJoin);

        return str;
    }

    public StringBuilder GetMenuStrIfEmptyList() {
        StringBuilder str = new StringBuilder();
        str.append("Добавьте задачу чтобы начать список дел: \n");

        return str;
    }
}
