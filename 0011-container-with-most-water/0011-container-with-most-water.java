class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left<right){
            int heights=Math.min(height[left],height[right]);
            int width=right-left;
            maxArea=Math.max(maxArea,width*heights);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxArea;
    }
}