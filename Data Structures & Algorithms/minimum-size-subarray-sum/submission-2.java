class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        for(int i = 0 ; i < nums.length ;i++){
            if(nums[i] >= target){
                return 1;
            }
        }
        if(nums.length == 0)return 0;
        if(nums.length == 1 && nums[0] == target)return 1;
        int left  = 0;
        int right = 1;
        int sum = nums[left]+nums[right];
        int ans = Integer.MAX_VALUE;
        while(left < right && right < nums.length){
            if(sum < target && right+1 < nums.length){
                right++;
                sum+=nums[right];
            }
            while(sum >= target){
                if(sum-nums[left] >= target){
                    sum = sum - nums[left];
                    left++;
                }else{
                    ans = Math.min(ans,right-left+1);
                    if(right+1 < nums.length){
                        right++;
                        sum+=nums[right];
                    }else{return ans;}
                }
            }
            if(sum < target && right == nums.length - 1){
                if(ans == Integer.MAX_VALUE){
                    return 0;
                }
                return ans;
            }
        }
        return ans;
        
    }
}