package task054_Tasks.Core.MVP.Models;

public class Task {
    private int id;
    private String name;
    private String description;

    public Task(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        Task t = (Task) obj;

        return this.name == t.name && this.description == t.description;
    }

    @Override
    public String toString() {
        return "id: " + id + "\n" + "name: " + name + "\n" + "description: " + description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
