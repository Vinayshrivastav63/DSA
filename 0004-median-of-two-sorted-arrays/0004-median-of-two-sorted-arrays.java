class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] merged = new int[n1 + n2];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            merged[k] = nums1[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            merged[k] = nums2[j];
            j++;
            k++;
        }
        
        int total = merged.length;
        int mid = total / 2;
        
        if (total % 2 != 0) {
            return merged[mid];
        } else {
            return (merged[mid - 1] + merged[mid]) / 2.0;
        }
    }
}