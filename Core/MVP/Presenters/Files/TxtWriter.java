package task054_Tasks.Core.MVP.Presenters.Files;

import java.io.IOException;

import task054_Tasks.Core.MVP.Models.AbstractFile;
import task054_Tasks.Core.MVP.Presenters.AbstractWriter;
import task054_Tasks.Core.service.Tasks;

public class TxtWriter extends AbstractWriter {
    public TxtWriter(Tasks tasks, AbstractFile abstractFile) {
        super(tasks, abstractFile);
    }

    public void Write() {
        try {
            String str = tasks.GetTasks();
            writer.write(str);
            writer.close();
            System.out.println("Файл txt обновлён");
        } catch (IOException e) {
            System.out.println("Файл обновить не удалось");
        }
    }
}
