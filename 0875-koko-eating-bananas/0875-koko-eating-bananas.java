class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;

        for (int p : piles)
            high = Math.max(high, p);

        return binarySearch(piles, h, low, high);
    }

    static int binarySearch(int[] piles, int h, int low, int high) {
        while (low < high) {
            int k = (low + high) / 2;

            if (canFinish(piles, h, k))
                high = k;
            else
                low = k + 1;
        }
        return low;
    }

    static boolean canFinish(int[] piles, int h, int k) {
        int hours = 0;

        for (int p : piles)
            hours += Math.ceil((double) p / k);

        return hours <= h;
    }
}
