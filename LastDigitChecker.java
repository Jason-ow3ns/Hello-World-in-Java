public class LastDigitChecker {
    public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree) {

        if ((numOne > 9 & numOne < 1001) & (numTwo > 9 & numTwo < 1001) & (numThree > 9 & numThree < 1001)) {
            numOne %= 10;
            numTwo %= 10;
            numThree %= 10;

            return numOne == numTwo || numOne == numThree || numThree == numTwo;
        }

        return false;
    }

    public static boolean isValid(int value) {
        return value > 9 & value < 1001;
    }
}
