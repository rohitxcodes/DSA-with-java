/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        // int[] nums = new int[n];
        int ans = search(n);
        return ans;
    }

    public int search(int n) {
        if (n == 1) {
            return 1;
        }
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int isMyPickCorrect = guess(mid);
            if (isMyPickCorrect == 0) {
                return mid;
            } else if (isMyPickCorrect == -1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    return -1;
    }
}
    // public int search(int[] nums) {
    //     if (nums.length == 1) {
    //         return 1;
    //     }
    //     int start = 1;
    //     int end = nums.length - 1;
    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;
    //         int isMyPickCorrect = guess(mid);
    //         if (isMyPickCorrect == 0) {
    //             return mid;
    //         } else if (isMyPickCorrect == -1) {
    //             end = mid - 1;
    //         } else {
    //             start = mid + 1;
    //         }
    //     }
    //     return -1;
    // }
// }