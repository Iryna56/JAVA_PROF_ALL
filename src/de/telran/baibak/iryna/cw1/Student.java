package de.telran.baibak.iryna.cw1;

public class Student {
    static final String TYPE = "University Student";
    String name;
    private int age;
    String rate;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("hi from constructor");
    }
    public Student(String name) {
        this.name = name;
    }
    public Student(int age) {
        this.age = age;
    }
    public Student() {
    }
    public int getAge(){
        return age;
    }

    public void sayHello(){
        System.out.println("Hello my name is  " + this.name);
    }
}
