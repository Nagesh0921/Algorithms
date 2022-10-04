class Solution {
    public int removeElement(int[] nums, int val) {
        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] != val){
        //         set.add(nums[i]);
        //     }
        // }
        // return set.size();
        // we cannot go for Hashset here, reason
        // 1. We need in-place arrangement of array -> Validation by Judge
        // To do so we need 2 pointers so that one pointer can read and other will write it
        // an existing array.
        int start = 0;
        for(int end = 0; end < nums.length; end++){
            if(nums[end] != val){
                nums[start] = nums[end];
                start++;
            }
        }
        return start;
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)
