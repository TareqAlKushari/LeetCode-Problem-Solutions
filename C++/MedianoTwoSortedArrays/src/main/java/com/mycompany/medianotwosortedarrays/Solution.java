package com.mycompany.medianotwosortedarrays;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        double out = 0.00000;
        int[] arr = new int[(n+m)];
        for(int i = 0; i < n; i++) {
            arr[i] = nums1[i];
        }
        for(int i = (n),j=0; i < (n+m); i++,j++) {
            arr[i] = nums2[j];
        }
        Arrays.sort(arr);
        if((n+m)%2 == 0) {
            out = arr[(((n+m)/2)-1)] + arr[((n+m)/2)];
            return (out/2);
        }else {
            out = arr[((n+m)/2)];
            return out;
        }
    }
}
