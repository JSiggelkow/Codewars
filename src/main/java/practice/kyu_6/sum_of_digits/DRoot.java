package practice.kyu_6.sum_of_digits;

public class DRoot {
    public static int digital_root(int n) {

        while ( n > 9) {
            n = String.valueOf(n).chars()
                    .map(i -> i - 48)
                    .reduce(Integer::sum)
                    .orElseThrow();
        }

        return n;
    }
}
