public class leapYearCalculator {
    public static boolean isLeapYear( int year ) {
        if (year > 0 && year < 9999) {
            return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        }
        return false;
    }
    }