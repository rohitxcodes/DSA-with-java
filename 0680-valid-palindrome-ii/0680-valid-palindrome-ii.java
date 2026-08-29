class Solution {
    public boolean validPalindrome(String s) {
        int start = 0;
        int e = s.length() - 1;

        while (start < e) {
            if (s.charAt(start) != s.charAt(e)) {
                return isPalindrome(s, start + 1, e) ||
                       isPalindrome(s, start, e - 1);
            }

            start++;
            e--;
        }

        return true;
    }

    private boolean isPalindrome(String s, int start, int e) {
        while (start < e) {
            if (s.charAt(start) != s.charAt(e)) {
                return false;
            }

            start++;
            e--;
        }

        return true;
    }
}