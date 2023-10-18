package de.telran.baibak.iryna.homework2;

public abstract class Car {

    abstract void accelerate();
}
class ElectricCar extends Car {
    @Override
    void accelerate() {}
    private int batteryCharge;


}
class PetrolCar extends Car {
    @Override
    void accelerate() {}
    private double petrolTankCapacity;
}
