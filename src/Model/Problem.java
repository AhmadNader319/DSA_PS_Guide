package Model;

import java.util.List;

public class Problem {
    private int id;
    private String name;
    private Difficulty difficulty;
    private Status status;
    private List<String> tags;

    public Problem(int id, String name, Difficulty difficulty, Status status, List<String> tags) {
        this.id = id;
        this.name = name;
        this.difficulty = difficulty;
        this.status = status;
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public List<String> getTags() {
        return tags;
    }
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", difficulty=" + difficulty +
                ", status=" + status +
                ", tags=" + tags +
                '}';
    }
}
