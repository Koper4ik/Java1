package task054_Tasks.Core.MVP.Presenters;

import java.io.FileWriter;

import task054_Tasks.Core.MVP.Models.AbstractFile;
import task054_Tasks.Core.service.Tasks;

public abstract class AbstractWriter {
    protected Tasks tasks;
    protected AbstractFile abstractFile;
    protected FileWriter writer;

    public AbstractWriter(Tasks tasks, AbstractFile abstractFile) {
        this.tasks = tasks;
        this.writer =  abstractFile.getWriter();
    }

    public abstract void Write();
}
