package Mathematics;

/**
 * @author Honghan Zhu
 * @leetcode 172
 * @grade easy
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int result = 0;
        while (n >= 5) {
            result += n / 5;
            n = n / 5;
        }
        return result;
    }
}
