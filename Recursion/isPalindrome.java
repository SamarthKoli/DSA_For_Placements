class Solution {

    public boolean isPalindrome(String s) {
        return isPalindromeHelper(s, 0, s.length() - 1);
    }

    private boolean isPalindromeHelper(String s, int i, int j) {
        // Base case: If pointers cross, it's a palindrome
        if (i >= j) {
            return true;
        }

        // Compare characters at both ends
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }

        // Recur with the next pair of characters
        return isPalindromeHelper(s, i + 1, j - 1);
    }
}
