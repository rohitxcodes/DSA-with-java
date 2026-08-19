class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] merged=new int[m+n];
        for(int i =0;i<m+n;i++){
            if(i<m){
                merged[i]=nums1[i];
            }else merged[i]=nums2[i-m];
        }
        Arrays.sort(merged);
        double median=0;
        if((m+n)%2==0){
            median= (merged[(n+m)/2 - 1] + merged[(n+m)/2]) / 2.0;
        }else median=(double)merged[(n+m)/2];
        return median;
    }
}