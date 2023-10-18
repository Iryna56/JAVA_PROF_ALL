package algorithms.homework4;

public class Cipher {
    //Шифрование с помощью шифра Цезаря
    public static void main(String[] args) {
        String message = "MAMA MYLA RAMU";
        //исходное сообщение для шифрования
        int shift = 3;
        // определяем сдвиг, который будет использоваться для шифрования
        String encryptedMessage = "";
        // создаем переменную для хранения зашифрованной строки

        for (int i = 0; i < message.length(); i++) {
            char character = message.charAt(i);
            //в цикле перебираем каждый символ нашей строки для шифрования
            //в переменную character записываем каждый символ из строки

            if (Character.isLetter(character)) {
                if (Character.isUpperCase(character)) {
                    //Проверяем, является ли символ буквой алфавита
                    char encryptedCharacter = (char) ((character - 'A' + shift) % 26 + 'A');
                    // Если символ является буквой верхнего регистра, то сдвигаем его в верхнем регистре по алфавиту
                    encryptedMessage += encryptedCharacter;
                    //Затем добавляем зашифрованный символ в нашу переменную
                } else {
                    char encryptedCharacter = (char) ((character - 'a' + shift) % 26 + 'a');
                    // Если символ является буквой нижнего регистра, то сдвигаем его в нижнем регистре по алфавиту
                    encryptedMessage += encryptedCharacter;
                    //Затем добавляем зашифрованный символ в нашу переменную
                }
            } else {
                encryptedMessage += character;
                // Если символ не является буквой, добавляем его без изменений
            }
        }

        System.out.println("Зашифрованное сообщение: " + encryptedMessage);
    }
}
// Хоть я и написала код не самостоятельно, но полностью в нем разобралась, прописав каждый шаг компиляции

