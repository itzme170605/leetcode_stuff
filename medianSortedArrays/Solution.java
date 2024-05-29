package medianSortedArrays;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int totalLength = nums1.length + nums2.length;
        int[] merged = new int[totalLength];
        int i1 = 0, i2 = 0, m = 0;
        while(i1 < nums1.length && i2 < nums2.length){
            if(nums1[i1] < nums2[i2]){
                merged[m++] = nums1[i1++];
            }else{
                merged[m++] = nums2[i2++];
            }
        }
        while(i1 < nums1.length){
            merged[m++] = nums1[i1++];
        }
        while(i2 < nums2.length){
            merged[m++] = nums2[i2++];
        }
        int mid = totalLength / 2;  

        if(totalLength % 2 == 1){
            return merged[mid];
        }else{
            return 0.5*(merged[mid] + merged[mid-1]);
        }
    }
    
}

