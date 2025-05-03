class Solution {
     public String longestCommonPrefix(String[] strs) {
        String commonPrefix="";
        
        Arrays.sort(strs);

        String first=strs[0];
        String last=strs[strs.length-1];

        int minlen=Math.min(first.length(), last.length());
     
        int i=0;
        while (i<minlen && first.charAt(i)==last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
        
    }
}