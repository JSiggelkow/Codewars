package practice.kyu_7.build_a_square;

public class Kata {
    public static final String generateShape(int n) {
        return (("+".repeat(n)) + "\n").repeat(n-1) + "+".repeat(n);
    }
}
