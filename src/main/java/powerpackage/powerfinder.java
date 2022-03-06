package powerpackage;

public class powerfinder {
    public static int OF(int base, int exponent) {
        int acc = 1;
        for (int i = 0; i < exponent; i++) {
            acc *= base;
        }
        return acc;
    }
}
