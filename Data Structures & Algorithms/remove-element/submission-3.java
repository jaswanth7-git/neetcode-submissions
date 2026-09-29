class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        int ans = 0;
        if(nums.length == 1){
            if(nums[0] == val){
                return 0;
            }else{
                return 1;
            }
        }
        while(left <= right){
            if(nums[right] == val && left != right){
                right--;
                ans++;
            }
            if(nums[left] == val){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
                ans++;
            }else{
                left++;
            }
        }return nums.length - ans;
    }
}