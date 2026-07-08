class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<n;i++){
            int count=map.get(nums[i]);
            if (count>n/2)  ans=nums[i];
        }
        return ans;
    }
}