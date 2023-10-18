package de.telran.baibak.iryna.cw2;

public class PhoneTest {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("");
        smartPhone.receiveCall("Петя");
        System.out.println(smartPhone.getCalc().sum(2, 3));

    }

    }

