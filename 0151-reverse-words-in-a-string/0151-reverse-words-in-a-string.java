class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String[] words = s.trim().split("\\s+");

        int i = 0;
        int j = words.length - 1;
        while (i < j) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;

            i++;
            j--;
        }

        for (String ch : words) {
            if (!ans.isEmpty()) {
                ans += " ";
            }
            ans += ch;
        }

        return ans;
    }
}