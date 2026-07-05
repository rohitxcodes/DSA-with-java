class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int total = prefix[nums.length - 1];

        for (int i = 0; i < nums.length; i++) {
            int leftSum, rightSum;

            if (i == 0) {
                leftSum = 0;
                rightSum = total - prefix[i];
            } else if (i == nums.length - 1) {
                leftSum = prefix[i - 1];
                rightSum = 0;
            } else {
                leftSum = prefix[i - 1];
                rightSum = total - prefix[i];
            }

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}