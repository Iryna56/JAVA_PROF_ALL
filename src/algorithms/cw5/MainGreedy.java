package algorithms.cw5;

import java.util.ArrayList;

public class MainGreedy {
    /*В задаче о рюкзаке жадный алгоритм не дает точного ответа,
    потому что он основывается на принципе выбора локально оптимального решения на каждом шаге
    Жадный алгоритм выбирает предмет с наибольшей стоимостью или наибольшим соотношением стоимости к весу на каждом шаге,
    чтобы максимизировать общую стоимость предметов в рюкзаке.
    * */


    //2. Жадный алгоритм
//Сначала возьмем самый дорогой, потом самый дорого из оставшихся итд
    public static void main(String[] args) {
        int[] weights = {3, 4, 5, 8, 9};
        int[] prices = {1, 6, 4, 7, 6};

        int maxWeight = 23;

        ArrayList<Integer> remainingIndexes = new ArrayList<>();
        ArrayList<Integer> selectedIndexes = new ArrayList<>();
        int selectedWeight = 0;

        // Заполняем список оставшихся индексов предметов
        for (int i = 0; i < weights.length; i++) {
            remainingIndexes.add(i);
        }

        // Выбираем предметы с максимальной ценой, пока общий вес не превысит максимальный
        while (!remainingIndexes.isEmpty()) {
            int maxPrice = prices[remainingIndexes.get(0)];
            int maxIndex = remainingIndexes.get(0);

            // Находим предмет с максимальной ценой
            for (int i = 1; i < remainingIndexes.size(); i++) {
                int currentIndex = remainingIndexes.get(i);
                if (prices[currentIndex] > maxPrice) {
                    maxPrice = prices[currentIndex];
                    maxIndex = currentIndex;
                }
            }

            // Проверяем, не превышает ли общий вес максимальный
            if (selectedWeight + weights[maxIndex] <= maxWeight) {
                // Добавляем предмет в выбранные
                selectedIndexes.add(maxIndex);
                selectedWeight += weights[maxIndex];
            }

            // Удаляем выбранный предмет из оставшихся
            remainingIndexes.remove(Integer.valueOf(maxIndex));
        }

        System.out.println("Оптимальное содержимое рюкзака:");
        for (int index : selectedIndexes) {
            System.out.println(index);
        }
    }
}
