package de.telran.baibak.iryna.cw10ComparatorComparable;

public class File {
    private String name;
    private String text;

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public File(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
