public class SharedDigit {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(56,15));


    }

    public static boolean hasSharedDigit(int numOne, int numTwo) {
        if (numOne < 10 || numOne > 99 || numTwo < 10 || numTwo > 99) {
            return false;
        }
        int firstDigitNumOne = numOne / 10;
        int secondDigitNumOne = numOne % 10;
        int firstDigitNumTwo = numTwo / 10;
        int secondDigitNumTwo = numTwo % 10;

        return firstDigitNumOne == firstDigitNumTwo || firstDigitNumOne == secondDigitNumTwo
                || secondDigitNumOne == firstDigitNumTwo || secondDigitNumOne == secondDigitNumTwo;

    }
}
