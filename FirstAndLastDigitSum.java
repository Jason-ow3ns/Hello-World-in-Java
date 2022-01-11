public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(3004534));
    }
    public static int sumFirstAndLastDigit( int number){
        int lastDigit = number % 10;
        int firstDigit = 0;
        int digitPlacement = 1;
        int num = number;

        if (num == 0){
            return 0;
        } else if (num < 0){
            return -1;
        }

        while (num > 0){
            num /= 10;
            digitPlacement *= 10;

        }
        firstDigit = number / (digitPlacement/10);
        return firstDigit + lastDigit;
    }

}x  
