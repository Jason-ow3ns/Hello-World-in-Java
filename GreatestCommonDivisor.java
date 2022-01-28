public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(365, 300));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int divisor = 1;

        if (first < 10 || second < 10) {
            return -1;
        }
        while (first != second) {
            if (first > second) {
                first -= second;
            } else {
                second -= first;
            }
        }
        return second;
    }
}
