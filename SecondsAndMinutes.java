public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 6));
        System.out.println(getDurationString(12074));
    }

    public static String getDurationString(int minutes, int seconds) {

        if ((minutes < 0) || (seconds < 0 || seconds > 60)) {
            return "Invalid Value";
        }

        int hours = minutes / 60;
        minutes = minutes % 60;

        String hr = hours + "h ";
        if (hours < 10) {
            hr = "0" + hr;
        }

        String mn = minutes + "m ";
        if (minutes < 10) {
            mn = "0" + mn;
        }

        String sc = seconds + "s";
        if (seconds < 10) {
            sc = "0" + sc;
        }

        return (hr + mn + sc);

    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid Value";
        }

        int minutes = seconds / 60;
        seconds = seconds % 60;
        String mn = minutes + "m ";
        String sc = seconds + "s";

        if (minutes < 10) {
            mn = "0" + mn;
        }

        if (seconds < 10) {
            sc = "0" + sc;
        }
        return mn + sc;

    }
}
