package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
     public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
          HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int n=arr.length;

        // Step 2: Build the result array
        ArrayList<Integer> res=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            res.add( map.getOrDefault(i, 0));
        }

        return res;
    }
}
