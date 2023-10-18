package algorithms_3108;

public class CountNumberRecursive {
    // напишите рекурсивную функцию, которая принимает положительное целое число и возвращает сумму его цифр( 12345 -> 15)
    public int count(int number) {

        return recursiveCount(number);
    }
    private int recursiveCount(int number) {
        int partOfNumber = number % 10;
        int nextNumber = number / 10;
        if(nextNumber == 0) {
            return partOfNumber;
        }
        return partOfNumber + recursiveCount(nextNumber);
    }

    public static void main(String[] args) {
        CountNumberRecursive countNumberRecursive = new CountNumberRecursive();
        System.out.println(countNumberRecursive.recursiveCount(123));
    }
}
