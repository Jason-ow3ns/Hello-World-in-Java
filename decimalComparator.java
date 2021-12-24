public class decimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double valueA, double valueB) {

        int valA = (int) (valueA * 1000);
        int valB = (int) (valueB * 1000);
        return (valA == valB);
    }
}
