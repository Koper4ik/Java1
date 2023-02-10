package task054_Tasks.Core.MVP.Presenters;

import java.io.BufferedReader;
import java.io.IOException;

import task054_Tasks.Core.MVP.Models.Task;
import task054_Tasks.Core.MVP.Models.FileTypes.TxtFile;
import task054_Tasks.Core.MVP.Models.FileTypes.XmlFile;
import task054_Tasks.Core.service.Tasks;

public class FilePresenter {
    private TxtFile txtFile;
    private XmlFile xmlFile;

    public FilePresenter(String txtPath, String xmlPath) {
        this.txtFile = new TxtFile(txtPath);
        this.xmlFile = new XmlFile(xmlPath);
    }

    public Tasks LoadFromFile() {
        BufferedReader reader = txtFile.getReader();
        String line = "";
        Tasks tasks = new Tasks();
        try {
            line = reader.readLine();
            String name = "";
            String description = "";
            int id = 0;

            while (line != null) {
                int point = line.indexOf(":");
                if (point != -1) {
                    String key = line.substring(0, point);
                    String val = line.substring(point + 2, line.length());
                    if (key.equals("name")) {
                        name = val;
                    } else if (key.equals("description")) {
                        description = val;
                    }
                }
                if (point == -1) {
                    id++;
                    Task task = new Task(id, name, description);
                    tasks.AddTask(task);
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            return null;
        }

        return tasks;
    }

    public void WriteFile(Tasks tasks) {
        FileFactory fileFactory = new FileFactory();
        AbstractWriter txtWriter = fileFactory.getWriter(txtFile, tasks);
        AbstractWriter xmlWriter = fileFactory.getWriter(xmlFile, tasks);

        txtWriter.Write();
        xmlWriter.Write();
    }
}
