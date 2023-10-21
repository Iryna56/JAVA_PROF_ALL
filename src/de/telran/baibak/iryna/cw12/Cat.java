package de.telran.baibak.iryna.cw12;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;
    private String colour;

    @Override
    public boolean equals(Object another) {
        if (another instanceof Cat){
            Cat anotherCat = (Cat) another;
            if (name.equals(anotherCat.getName()) && age == anotherCat.getAge()
            && colour.equals(anotherCat.getColour()) && isHungry == anotherCat.isHungry())
                return true;
        }
        return false;
    }
//    @Override
//    public boolean equals(Object another) {
//        if (another instanceof Cat){
//            Cat anotherCat = (Cat) another;
//            if (name.equals(anotherCat.getName()))
//                return true;
//        }
//        return false;
//    }


    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public Cat(String name, int age, String colour, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.isHungry = isHungry;
    }

    private boolean isHungry;

}
