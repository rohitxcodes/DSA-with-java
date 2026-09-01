class Solution {

    public int subsetXORSum(int[] nums) {
        return subsetXORSum(0, new ArrayList<>(), nums);
    }

    public int subsetXORSum(int index, ArrayList<Integer> list, int[] nums) {

        // Base case: we have decided for every element
        if (index == nums.length) {

            int xor = 0;

            for (int num : list) {
                xor = xor ^ num;
            }

            return xor;
        }

        // TAKE nums[index]
        list.add(nums[index]);

        int take = subsetXORSum(index + 1, list, nums);

        // UNDO TAKE
        list.remove(list.size() - 1);

        // DON'T TAKE nums[index]
        int notTake = subsetXORSum(index + 1, list, nums);

        return take + notTake;
    }
}