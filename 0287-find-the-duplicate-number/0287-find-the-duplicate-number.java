class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(int x:nums){
            int ele=map.get(x);
            if(ele>1){
                ans= x;
            }
        }
        return ans;
    }
}