class Solution {
    public int findJudge(int n, int[][] trust) {

        int[] score = new int[n + 1];

        for (int[] x : trust) {
            score[x[0]]--; // x[0] trusts someone
            score[x[1]]++; // x[1] is trusted
        }

        for (int i = 1; i <= n; i++) {
            if (score[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}