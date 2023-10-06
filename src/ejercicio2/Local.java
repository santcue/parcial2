package ejercicio2;

import java.io.Serializable;

public class Local implements Serializable {
    private int id;
    private String name;
    private String category;
    private String schedule;

    public Local(int id, String name, String category, String schedule) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.schedule = schedule;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Local{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", schedule='" + schedule + '\'' +
                '}';
    }
}
