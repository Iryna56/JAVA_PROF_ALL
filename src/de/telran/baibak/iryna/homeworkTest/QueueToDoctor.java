package de.telran.baibak.iryna.homeworkTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueToDoctor {
    /*Используя одну из коллекций, напишите программу «Очередь к врачу».
    Пациенты могут бронировать любой временной слот (например, 1 - 9:00, 2 - 9:30, 3 - 10:00 и т.д.)
    для приёма у доктора, при этом указывая в записи своё имя.
    В день приёма программа должна выводить врачу имя следующего пациента строго в порядке номера временного слота.
    * */

    public static void main(String[] args) {
        Queue<String> doctorQueue = new LinkedList<>();

        System.out.println("Доступные временные слоты:");
        System.out.println("1 - 9:00");
        System.out.println("2 - 9:30");
        System.out.println("3 - 10:00");
        // Добавьте остальные временные слоты, если необходимо

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите номер временного слота или 'exit' для выхода: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int slotNumber = Integer.parseInt(input);
                System.out.print("Введите имя пациента: ");
                String patientName = scanner.nextLine();

                doctorQueue.add(patientName + " - " + slotNumber);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод номера временного слота.");
            }
        }

        System.out.println("Очередь к врачу:");
        while (!doctorQueue.isEmpty()) {
            String nextPatient = doctorQueue.poll();
            System.out.println(nextPatient);
        }
    }
}
