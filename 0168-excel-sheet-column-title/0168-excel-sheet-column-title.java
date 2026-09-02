class Solution {
    public String convertToTitle(int columnNumber) {
        String s="";
        while(columnNumber>0){
            columnNumber--;

            char ch=(char)('A'+columnNumber%26);
            s=ch+s;
            columnNumber/=26;
        }
        return s;
    }
}