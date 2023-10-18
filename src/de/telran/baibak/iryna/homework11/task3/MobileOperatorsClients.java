package de.telran.baibak.iryna.homework11.task3;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MobileOperatorsClients {
    private boolean isVip;

    public MobileOperatorsClients(boolean isVip) {
        this.isVip = isVip;
    }

    @Override
    public String toString() {
        return "MobileOperatorsClients{" +
                "isVip=" + isVip +
                '}';
    }

    public static void main(String[] args) {
        Comparator<MobileOperatorsClients> mobileOperatorsClientsComparator = new Comparator<MobileOperatorsClients>() {
            @Override
            public int compare(MobileOperatorsClients client1, MobileOperatorsClients client2) {
                if (client1.isVip && !client2.isVip) {      //если первый VIP а второй нет
                    return -1;
                } else if (!client1.isVip && client2.isVip) {  //  если первый не VIP, а второй да
                    return 1;
                } else {
                    return 0;     //  если оба не Вип
                }

            }
        };

        Queue<MobileOperatorsClients> clientsQueue = new PriorityQueue<>(mobileOperatorsClientsComparator);

        clientsQueue.add(new MobileOperatorsClients(true));
        clientsQueue.add(new MobileOperatorsClients(false));
        clientsQueue.add(new MobileOperatorsClients(false));
        clientsQueue.add(new MobileOperatorsClients(true));
        clientsQueue.add(new MobileOperatorsClients(true));
        clientsQueue.add(new MobileOperatorsClients(false));
        clientsQueue.add(new MobileOperatorsClients(true));
        clientsQueue.add(new MobileOperatorsClients(false));
        clientsQueue.add(new MobileOperatorsClients(true));
        clientsQueue.add(new MobileOperatorsClients(false));




        while (!clientsQueue.isEmpty()) {
            MobileOperatorsClients clients = clientsQueue.poll();
            System.out.println("Обслуживается клиент " + clients);
        }
    }
}


