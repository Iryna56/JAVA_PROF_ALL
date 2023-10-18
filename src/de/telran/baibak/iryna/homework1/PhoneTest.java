package de.telran.baibak.iryna.homework1;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phoneOne = new Phone();
        phoneOne.model = "samsung";
        phoneOne.weight = 10;
        phoneOne.setNumber("12345");
        System.out.println(phoneOne.model);
        System.out.println(phoneOne.weight);
        System.out.println(phoneOne.getNumber());
        System.out.println();
        Phone PhoneTwo = new Phone();
        PhoneTwo.model = "apple";
        PhoneTwo.weight = 14;
        PhoneTwo.setNumber("54321");
        System.out.println(PhoneTwo.model);
        System.out.println(PhoneTwo.weight);
        System.out.println(PhoneTwo.getNumber());
        System.out.println();

        Phone PhoneThree = new Phone();
        PhoneThree.model = "redmi";
        PhoneThree.setWeight(12);
        PhoneThree.setNumber("11111");
        System.out.println(PhoneThree.model);
        System.out.println(PhoneThree.getWeight());
        System.out.println(PhoneThree.getNumber());

        System.out.println("-----------------");

        phoneOne.receiveCall("Ben");
        PhoneTwo.receiveCall("Mark");
        PhoneThree.receiveCall("Tom");
        System.out.println("------------------");
        phoneOne.call("Lucia");
        PhoneTwo.call("Katya");
        PhoneThree.call("Sara");
    }
}
