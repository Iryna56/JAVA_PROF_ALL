package de.telran.baibak.iryna.homework1;

import java.util.Random;

public class Phone {
    private String number;
    public String model;
    int weight;


    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Error");
        }
    }
    public int getWeight() {
    return weight;
    }
    public void receiveCall(String nameIn){
        System.out.println(nameIn + " calling");
    }
    public void call(String nameOut){
        Random random = new Random();
        boolean q = random.nextBoolean();
        if (q == true){
            System.out.println("Connection with " + nameOut);
        } else {
            System.out.println("Subscriber unavailable");
        }
    }

}





