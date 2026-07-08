class Solution {
    public boolean isPalindrome(String s) {
        s=cleanup(s);
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            right--;
            left++;
        }
        return true;
    }
   public String cleanup(String s) {
    s = s.toLowerCase();

    StringBuilder sb = new StringBuilder();

    for (char c : s.toCharArray()) {
        if (Character.isLetterOrDigit(c)) {
            sb.append(c);
        }
    }

    return sb.toString();
}
}