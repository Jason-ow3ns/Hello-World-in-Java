public class CentimeterCalculator {

    public static void main(String[] args) {
        calculateFeetAndInchesToCentimeters(2, 4);
        calculateFeetAndInchesToCentimeters(7);
    }

    public static double calculateFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches > 12 || inches < 0)) {
            return -1;
        }
        double centimeters = ((feet * 12) + inches) * 2.54;
        System.out.println(feet + " feet + " + inches + " inches = " + centimeters + " centimeters.");
        return centimeters;

    }

    public static double calculateFeetAndInchesToCentimeters(int feet) {
        if (feet < 0) {
            return -1;
        }
            int inches = (feet * 12);
            System.out.println(feet + " feet = " + inches + " inches.");
            return inches;

    }
}
