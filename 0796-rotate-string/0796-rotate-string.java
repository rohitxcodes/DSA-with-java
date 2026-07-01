class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            String temp = String.valueOf(s.charAt(0));
            s = s + temp;
            s = s.substring(1);

            if (s.equals(goal)) return true;
        }

        return false;
    }
}