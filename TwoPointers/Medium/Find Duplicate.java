class Solution {
    public int findDuplicate(int[] nums) {
        // As there are duplicate numbers in an array.
        // The first thing comes in mind is Set. Other one is Sort
        
        //1. Set
        // HashSet<Integer> set = new HashSet<>();
        // for(int n : nums){
        //     if(set.contains(n)){
        //         return n;
        //     }
        //     set.add(n);
        // }
        // return -1;
        
        //2. Sort
        // Arrays.sort(nums);
        // for(int i=1; i<nums.length; i++){
        //     if(nums[i] == nums[i-1]){
        //         return nums[i];
        //     }
        // }
        // return -1;
        
        //3. Binary Search with sort in place.
        
        //4. Floyd's Algorithm
        int slowerPtr = nums[0], fasterPtr = nums[0];
        
        do{
            slowerPtr = nums[slowerPtr];
            fasterPtr = nums[nums[fasterPtr]];
        } while (slowerPtr != fasterPtr);
        
        slowerPtr = nums[0];
        while(slowerPtr != fasterPtr) {
            slowerPtr = nums[slowerPtr];
            fasterPtr = nums[fasterPtr];
        }
        
        return fasterPtr;
    }
}
