public class TeenNumberChecker {
    public static boolean hasTeen(int valA, int valB, int valC){
        return ((valA > 12) && (valA < 20)) || ((valB > 12) && (valB < 20)) || ((valC > 12) && (valC < 20));
    }
    public static boolean isTeen(int inputA){
        return (inputA > 12) && (inputA < 20);
    }
}

