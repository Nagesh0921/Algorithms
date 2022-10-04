class Solution {
    public void reverseString(char[] s) {
        int start = 0, end = s.length-1;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++; end--;
        }
        
        // Learning Point: 
        // 1. In-place -> does not mean in constant space. it can be O(N)
        // Recursion Stacks are in-place but not constant space.
    }
}
