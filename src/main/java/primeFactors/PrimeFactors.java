package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }
}
