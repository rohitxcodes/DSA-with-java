class KthLargest {
    int k;
    int[] nums;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.nums=nums;
    }
    
    public int add(int val) {
        int[] ans = Arrays.copyOf(nums, nums.length + 1);
        ans[nums.length] = val;
        nums = ans;
        Arrays.sort(ans);
        return ans[ans.length - k];
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */