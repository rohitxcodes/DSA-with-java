class Solution {
    int[] dp;

    public int tribonacci(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);

        dp[0] = 0;
        if (n >= 1) dp[1] = 1;
        if (n >= 2) dp[2] = 1;

        return solve(n);
    }

    int solve(int n) {
        if (dp[n] != -1) return dp[n];

        dp[n] = solve(n - 1) + solve(n - 2) + solve(n - 3);
        return dp[n];
    }
}