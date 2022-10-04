class Solution {
    public void sortColors(int[] nums) {
        // RGB to denote in terms of 0,1,2
        int start = 0, end = nums.length-1, curr = 0, temp;
        while(curr <= end){
            if (nums[curr] == 2) {
                temp = nums[curr];
                nums[curr] = nums[end];
                nums[end--] = temp;
            } else if (nums[curr] == 0) {
                temp = nums[start];
                nums[start++] = nums[curr];
                nums[curr++] = temp;
            } else {
                curr++;
            }
        }
    }
}

// Sort an array {0, 2, 2, 1, 1, 0} => {0, 0, 1, 1, 2, 2}
// Time Complexity = O(N)
