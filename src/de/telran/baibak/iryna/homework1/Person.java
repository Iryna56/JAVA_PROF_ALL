package de.telran.baibak.iryna.homework1;

import java.util.Random;

public class Person {
String fullName;
private int age;

public void talk(){
    System.out.println("Iryna talk");
}

public void move(){
    Random random = new Random();
    int q = random.nextInt(0, 101);
    System.out.println(q);
}
Person(String fullName, int age){
    this.fullName = fullName;
    this.age = age;
}
public Person(){
}

    public int getAge(){
    return age;
}


}
