class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left  = 0;
        int right = 0;
        int sum = nums[left];
        int ans = Integer.MAX_VALUE;
        while(left <= right && right < nums.length){
            while(sum >= target){
                if(sum-nums[left] >= target){
                    sum = sum - nums[left];
                    left++;
                }else{
                    ans = Math.min(ans , right-left+1);
                    if(right+1 == nums.length){
                        return ans;
                    }else{
                        right++;
                        sum+=nums[right];
                    }
                }
            }
            if(sum < target && right < nums.length){
                if(right == nums.length - 1) return ans == Integer.MAX_VALUE ? 0 : ans;
                right++;
                sum+=nums[right];
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }  
}