package algorithms.Classwork2509;

public class LuhnAlgorithms {
    public static void main(String[] args) {
        String cardNumber = "9877647097632352";
        boolean isValid = isValidLuna(cardNumber);
        System.out.println(isValid);


    }

    private static boolean isValidLuna(String cardNumber) {
        int nDigits = cardNumber.length();
        int sum = 0;
        boolean alternate = false;

        for (int i = nDigits - 1; i >= 0; i--) {
            int n = Character.getNumericValue(cardNumber.charAt(i));

            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = n - 9;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0) ;
    }


}
