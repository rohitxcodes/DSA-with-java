class Solution {

    static String[] keypad = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if(digits.isEmpty()) return ans;

        helper("", digits, ans);

        return ans;
    }

    static void helper(String p, String up, List<String> ans){

        if(up.isEmpty()){
            ans.add(p);
            return;
        }

        String letters = keypad[up.charAt(0) - '0'];

        for(int i = 0; i < letters.length(); i++){
            helper(
                p + letters.charAt(i),
                up.substring(1),
                ans
            );
        }
    }
}