class Solution {
    public String removeOccurrences(String s, String part) {
        String ans="";
        for(char ch:s.toCharArray()){
            ans+=ch;
            if(ans.endsWith(part)){
                ans=ans.substring(0,ans.length()-part.length());
            }
        }
        return ans;
    }
}