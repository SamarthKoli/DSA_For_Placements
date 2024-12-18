// PS:- 1838. Frequency of the Most Frequent Element


//The frequency of an element is the number of times it occurs in an array.
//You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment the element at that index by 1.
//Return the maximum possible frequency of an element after performing at most k operations.



package Hashing;

import java.util.Arrays;


class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums); // Step 1: Sort the array
        int l = 0, maxFreq = 0;
        long total = 0;

        // Step 2: Use sliding window
        for (int r = 0; r < nums.length; r++) {
            total += nums[r]; // Add the current element to the total

            // Step 3: Check if the current window is valid
            while ((long) nums[r] * (r - l + 1) - total > k) {
                total -= nums[l]; // Shrink the window from the left
                l++;
            }

            // Step 4: Update the maximum frequency
            maxFreq = Math.max(maxFreq, r - l + 1);
        }

        return maxFreq; // Step 5: Return the result
    }
}
