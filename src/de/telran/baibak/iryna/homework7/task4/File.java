package de.telran.baibak.iryna.homework7.task4;

public class File {
    private String name;
    private String extension;
    private String content;

    public File(String name, String extension, String content) {
        this.name = name;
        this.extension = extension;
        this.content = content;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", extension='" + extension + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
