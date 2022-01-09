public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(digitSum(1501));
    }
    public static int digitSum(int number){


        if (number >=10){
            int sum = 0;

            while (number > 0){
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            return sum;
        }
        return -1;

    }
}
