public class ClimbingStairs {

    /**
     * Climbing Stairs
     * You are climbing a staircase. It takes n steps to reach the top.
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     *==================================================================================================
     * To calculate the number of ways to climb the stairs,
     * we can observe that when we are on the nth stair,
     * we can either come from the (n-1)th stair or the (n-2)th stair.
     */
    public static int climbStairs(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
