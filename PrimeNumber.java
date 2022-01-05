public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 13; i < 25; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + "is prime.");
                if (count == 3) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i=2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
