public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes <= 0) {
            System.out.println("Invalid Value");
        }

        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        long remainingDays = days % 365;
        if (remainingDays == 365) {
            remainingDays = 0;
        }

        String totalDays = remainingDays + " d ";
        String totalYears = years + " y";

        if (minutes >= 0) {
            System.out.println(minutes + " min = " + totalYears + " and " + totalDays);
        }

    }
}
