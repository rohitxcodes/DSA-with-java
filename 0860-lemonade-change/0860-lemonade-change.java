class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int x : bills) {
            if (x == 5) {
                five++;
            }
            else if (x == 10) {
                if (five < 1) {
                    return false;
                }
                five--;
                ten++;
            }
            else if (x == 20) {
                if (ten >= 1 && five >= 1) {
                    ten--;
                    five--;
                }
                else if (five >= 3) {
                    five -= 3;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return true;
    }
}