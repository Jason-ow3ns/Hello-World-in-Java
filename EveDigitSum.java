public class EveDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(246891341));
    }

    public static int getEvenDigitSum (int number){

        int currentDigit = 0;
        int evenDigitSum = 0;

        if (number < 0){
            return -1;
        }
        while (number > 0){
            currentDigit = number % 10;
            if (currentDigit % 2 == 0){
                evenDigitSum += currentDigit;
            }
            number /= 10;
        }
        return evenDigitSum;

    }
}
