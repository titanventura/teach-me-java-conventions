public class PowerFinder {
    public static int of(int base, int exponent) {
        int acc = 1;
        for (int i = 0; i < exponent; i++) {
            acc *= base;
        }
        return acc;
    }
}
