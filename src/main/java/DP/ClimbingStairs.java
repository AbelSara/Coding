package DP;

/**
 * @author Honghan Zhu
 * @leetcode 70
 * @grade easy
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int stairs[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (i + 1 <= n) {
                stairs[i + 1] += 1;
            }
            if (i + 2 <= n) {
                stairs[i + 2] += 1;
            }
        }
        return stairs[n];
    }
}
