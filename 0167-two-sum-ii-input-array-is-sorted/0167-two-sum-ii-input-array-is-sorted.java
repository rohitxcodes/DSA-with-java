class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        
        for(int i=0;i<numbers.length;i++){
            int comp=target-numbers[i];
            int index = bs(numbers,comp,i+1,numbers.length-1);

            if(index > -1){
                ans[0]=i+1;
                ans[1]=index+1;
            }
        }

        return ans;
    }

    public int bs(int[] arr, int target, int s, int e) {
        if (s > e)
            return -1;

        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            return bs(arr, target, mid + 1, e);
        } else {
            return bs(arr, target, s, mid - 1);
        }
    }
}