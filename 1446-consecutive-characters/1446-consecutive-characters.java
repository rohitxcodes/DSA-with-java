class Solution {
    public int maxPower(String s) {
        int left = 0;
        int right = 1;
        int power = 1;
        int maxPower = 1;

        while (right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                power++;
            } else {
                left = right;   
                power = 1;
            }

            maxPower = Math.max(maxPower, power);
            right++;
        }

        return maxPower;
    }
}