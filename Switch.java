public class Switch {
    public static void main(String[] args) {
        char mySwitchValue = 'F';

        switch (mySwitchValue) {

            case 'A':
                System.out.println("Value = A");
                break;

            case 'B':
                System.out.println("Value = B");
                break;

            case 'C':
                System.out.println("Value = C");
                break;

            case 'D':
                System.out.println("Value =D");
                break;

            case 'E':
                System.out.println("Value = E");
                break;

            default:
                System.out.println("Other Value Found");
                break;
        }
    }
}
