class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                sb.append(ch);
            }
        }

        return check(sb.toString(), 0, sb.length() - 1);
    }

    public boolean check(String s, int left, int right) {
        if (left >= right)
            return true;

        if (s.charAt(left) != s.charAt(right))
            return false;
        return check(s, left + 1, right - 1);
    }
}
