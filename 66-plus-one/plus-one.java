class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            // Add 1 to the current digit
            digits[i] += 1;
            
            // If the result is less than 10, no carry needed, return the array
            if (digits[i] < 10) {
                return digits;
            }
            
            // If the result is 10, set this digit to 0 and carry 1 to the next digit
            digits[i] = 0;
            // Loop continues to the next digit on the left
        }
        
        // If we exit the loop, it means all digits were 9 (e.g., [9,9] → [1,0,0])
        // Create a new array with size + 1
        int[] result = new int[digits.length + 1];
        result[0] = 1; // The carry becomes the new leading digit
        // Rest of the digits are already 0 by default in the new array
        return result;
    }
}