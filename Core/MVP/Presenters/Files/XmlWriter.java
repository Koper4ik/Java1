package task054_Tasks.Core.MVP.Presenters.Files;

import java.io.IOException;

import task054_Tasks.Core.MVP.Models.AbstractFile;
import task054_Tasks.Core.MVP.Models.Task;
import task054_Tasks.Core.MVP.Presenters.AbstractWriter;
import task054_Tasks.Core.service.Tasks;

public class XmlWriter extends AbstractWriter {
    public XmlWriter(Tasks tasks, AbstractFile abstractFile) {
        super(tasks, abstractFile);
    }

    public void Write() {
        try {
            writer.write("<?xml encoding='utf-8'>\n");
            writer.write("<TasksList>\n");
            for (Task task : tasks.getTasks()) {
                writer.write("<id id=" + task.getId() + ">" + task.getId() + "</id>\n");
                writer.write("<name name=" + task.getName() + ">" + task.getName() + "</name>\n");
                writer.write("<desctiption description=" + task.getDescription() + ">" + task.getDescription() + "</description>\n");
            }
            writer.write("</TasksList>\n");
            writer.close();
            System.out.println("Файл xml обновлён");
        } catch (IOException e) {
            System.out.println("Файл обновить не удалось");
        }
    }
}
