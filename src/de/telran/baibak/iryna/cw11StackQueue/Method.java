package de.telran.baibak.iryna.cw11StackQueue;

import java.util.List;

public class Method {
    List<String> paramNames;
    String name;
    String outputParam;

    @Override
    public String toString() {
        return "Method{" +
                "paramNames=" + paramNames +
                ", name='" + name + '\'' +
                '}';
    }

    public Method(String name, String outputParam) {
        this.name = name;
        this.outputParam = outputParam;
    }

    public Method(String name, List<String> paramNames) {
        this.paramNames = paramNames;
        this.name = name;
    }

    public Method(String name) {
        this.name = name;
    }
}
