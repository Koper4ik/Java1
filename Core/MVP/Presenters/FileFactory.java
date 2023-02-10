package task054_Tasks.Core.MVP.Presenters;

import task054_Tasks.Core.MVP.Models.AbstractFile;
import task054_Tasks.Core.MVP.Models.FileTypes.TxtFile;
import task054_Tasks.Core.MVP.Models.FileTypes.XmlFile;
import task054_Tasks.Core.MVP.Presenters.Files.TxtWriter;
import task054_Tasks.Core.MVP.Presenters.Files.XmlWriter;
import task054_Tasks.Core.service.Tasks;

public class FileFactory {
    public AbstractWriter getWriter(AbstractFile abstractFile, Tasks tasks) {
        AbstractWriter writer = null;

        if (abstractFile instanceof TxtFile) {
            writer = new TxtWriter(tasks, abstractFile);
        } else if (abstractFile instanceof XmlFile) {
            writer = new XmlWriter(tasks, abstractFile);
        } else {
            System.out.println("Неизвестный формат");
        }

        return writer;
    }
}
