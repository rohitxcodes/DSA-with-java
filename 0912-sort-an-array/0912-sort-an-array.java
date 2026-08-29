class Solution {
     public int[] sortArray(int[] nums) {
        if (nums.length <= 1) return nums;

        int mid = nums.length / 2;

        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);

        left = sortArray(left);
        right = sortArray(right);

        return merge(left, right);
    }
    public int[] merge(int[] left, int[] right) {
        int[] arr = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }

        while (i < left.length)
            arr[k++] = left[i++];

        while (j < right.length)
            arr[k++] = right[j++];

        return arr;
    }
}