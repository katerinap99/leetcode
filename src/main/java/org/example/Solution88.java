package org.example;

import java.util.Arrays;

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0)
            nums1 = Arrays.copyOfRange(nums2, 0, n);
        else if (n > 0) {
            int max1 = nums1[m-1];
            int max2 = nums2[n-1];
            int index1 = m-1;
            int index2 = n-1;
            int i = m + n -1;
            while (max2 != Integer.MIN_VALUE ) {
                if (max1 >= max2 ) {
                    nums1[i] = nums1[index1];
                    if (index1 > 0) {
                        index1--;
                        max1 = nums1[index1];
                    }
                    else
                        max1 = Integer.MIN_VALUE;
                }
                else {
                    nums1[i] = nums2[index2];
                    if (index2 > 0 ) {
                        index2--;
                        max2 = nums2[index2];
                    }
                    else
                        max2 = Integer.MIN_VALUE;
                }
                i--;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
