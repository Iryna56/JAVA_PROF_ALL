package de.telran.baibak.iryna.homework6.task8;

import java.util.ArrayList;

import java.util.Scanner;

public class ListPerson {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Person person1 = new Person("Пупкин Вася", 987654);
        Person person2 = new Person("Пупкин Петя", 987494);
        Person person3 = new Person("Пенков Вася", 993764);
        Person person4 = new Person("Пупкин Коля", 992374);
        Person person5 = new Person("Пенков Петя", 909856);

        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию человека с большой буквы");
        String name1 = scanner.nextLine();


        // суть поняла, но не смогла написать. Понимаю, что здесь должнен применятся метод equals.
        // И скорей всего прохождение через foreach. Не знаю правильно ли то, что пользователь вводи фамилию через сканер


        }
    }








