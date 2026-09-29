class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int r = 1;
        while(l <= r && r < nums.length){
            if(nums[l] == nums[r]){
                r++;
            }else{
                l++;
                nums[l] = nums[r];
            }

        }
        return l+1;
    }
}