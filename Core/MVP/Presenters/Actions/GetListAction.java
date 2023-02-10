package task054_Tasks.Core.MVP.Presenters.Actions;

import task054_Tasks.Core.MVP.Presenters.ActionPresenter;
import task054_Tasks.Core.service.Tasks;

public class GetListAction extends ActionPresenter {
    public GetListAction(Tasks tasks) {
        super(tasks);
    }

    public void RunAction() {
        taskView.ViewTasks(tasks.GetTasks());
    }
}
