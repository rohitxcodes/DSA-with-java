class Solution {
    public int singleNumber(int[] nums) {
        int ans=nums[0];
        for(int num=1;num<nums.length;num++){
            ans=ans^nums[num];
        }
        return ans;
    }
}