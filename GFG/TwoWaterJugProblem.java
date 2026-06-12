package GFG;

public class TwoWaterJugProblem {
    public static void main(String[] args) {
        int m = 11;
        int n = 5;
        int d = 24;
        System.out.println(solve(m, n, d));
        System.out.println(gcd(n, m));
    }

    private static int solve(int m, int n, int d) {
        // 1. Basic feasibility checks
        if (d > Math.max(m, n)) return -1;
        if (d % gcd(m, n) != 0) return -1;

        // 2. Return the minimum of starting with jug m or jug n
        return Math.min(solved(m, n, d), solved(n, m, d));
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static int solved(int fromCap, int toCap, int target) {
        int from = fromCap; // Initial fill
        int to = 0;
        int steps = 1;

        while (from != target && to != target) {
            // Find the max amount we can pour
            int temp = Math.min(from, toCap - to);

            // Pour from -> to
            to += temp;
            from -= temp;
            steps++;

            if (from == target || to == target) break;

            // If "from" jug is empty, fill it
            if (from == 0) {
                from = fromCap;
                steps++;
            }

            // If "to" jug is full, empty it
            if (to == toCap) {
                to = 0;
                steps++;
            }
        }
        return steps;
    }
}
