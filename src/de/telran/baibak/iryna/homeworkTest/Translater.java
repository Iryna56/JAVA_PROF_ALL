package de.telran.baibak.iryna.homeworkTest;

import com.sun.java.accessibility.util.Translator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translater {
    /*Создайте программу-переводчик с английского языка.
    Пользователь вводит слово на английском языке,
    переводчик показывает перевод.
    Если переводчик не обнаружил в словаре введённое слово,
    то он просит пользователя ввести перевод, после чего сохраняет слово и его перевод в словарь.
    * */

    private Map<String, String> dictionary;

    public Translater() {
        dictionary = new HashMap<>();
        dictionary.put("hello", "привет");
        dictionary.put("world", "мир");
    }

    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else {
            System.out.println("Слово \"" + word + "\" не найдено в словаре.");
            System.out.print("Введите перевод: ");
            Scanner scanner = new Scanner(System.in);
            String translation = scanner.nextLine();
            dictionary.put(word, translation);
            return translation;
        }
    }

    public static void main(String[] args) {
        Translater translator = new Translater();

        System.out.print("Введите слово на английском языке: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        String translation = translator.translate(word);
        System.out.println("Перевод: " + translation);
    }
}
