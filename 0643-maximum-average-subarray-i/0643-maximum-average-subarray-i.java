class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg=0;
        double sum=0;
        double avg=0;
        int left=0;
        int right=k-1;
        int n=nums.length;
        for(int i=0;i<=right;i++){
            sum+=nums[i];
        }
        maxAvg=sum/k;
        while(right<n-1){
            sum-=nums[left];
            left++;
            right++;
            sum+=nums[right];
            avg=sum/k;
            maxAvg=(double)Math.max(maxAvg,avg);
        }
        return maxAvg;

    }
}