package de.telran.baibak.iryna.homework2.zoo;

public class ZooTest {
    public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    Cow cow = new Cow("burenka", "white");
    Lamb lamb = new Lamb("rex", "black");


    cow.eat("meat");
    cat.eat("meat");
    dog.eat("meat");
    lamb.eat("meat");

    }
}
