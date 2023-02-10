package task054_Tasks.Core.MVP.Models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public abstract class AbstractFile {
    private BufferedReader reader;
    private FileWriter writer;
    private String path;

    public AbstractFile(String path) {
        this.path = path;
    }

    private void setReader() {
        try {
            File f = new File(path);
            FileReader fr = new FileReader(f);
            reader = new BufferedReader(fr);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    private void setWriter() {
        try {
            writer = new FileWriter(path);
        } catch (Exception e) {
            System.out.println("Файл не найден");
        }
    }

    public BufferedReader getReader() {
        setReader();

        return reader;
    }

    public FileWriter getWriter() {
        setWriter();

        return writer;
    }
}
