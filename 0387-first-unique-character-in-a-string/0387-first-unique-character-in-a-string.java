class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map =new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            count=map.get(s.charAt(i));
            if(count==1){
                return i;
            }
        }

        return -1;
    }
}