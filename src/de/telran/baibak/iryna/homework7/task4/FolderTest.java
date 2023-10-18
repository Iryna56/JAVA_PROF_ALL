package de.telran.baibak.iryna.homework7.task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FolderTest {
    public static void main(String[] args) {
        Folder folder = new Folder("test", "res");
        List<File> fileList = new ArrayList<>();
        fileList.add(new File("file1", "doc", "content1"));
        fileList.add(new File("file2", "txt", "content2"));
        fileList.add(new File("file3", "doc", "content3"));
        fileList.add(new File("file4", "txt", "content4"));
        fileList.add(new File("file5", "doc", "content5"));
        iterateFolder(fileList);

    }

    public static List<String> iterateFolder(List<File> fileList) {
        List<String> files = new ArrayList<>();
        Iterator<File> iterator = fileList.iterator();
        while (iterator.hasNext()) {
                System.out.println(iterator.next().toString());
            }
        return null;
        }

    }


