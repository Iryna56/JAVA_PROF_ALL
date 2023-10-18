package de.telran.baibak.iryna.homework7.task4;

import java.util.ArrayList;
import java.util.List;

public class Folder {
   private String name;
   private String person;

    public Folder(String name, String person) {
        this.name = name;
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public String getPerson() {
        return person;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", person='" + person + '\'' +
                ", files=" + files +
                '}';
    }

    private List<File> files;

    public List<File> getFiles() {
        return files;
    }
}
