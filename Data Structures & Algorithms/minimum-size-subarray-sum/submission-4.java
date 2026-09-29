class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left  = 0;
        int right = 0;
        int sum = nums[left];
        int ans = Integer.MAX_VALUE;
        while(left <= right && right < nums.length){
            while(sum >= target){
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left];
                left++;
            }
            if(sum < target){
                if(right == nums.length - 1) return ans == Integer.MAX_VALUE ? 0 : ans;
                right++;
                sum+=nums[right];
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }  
}