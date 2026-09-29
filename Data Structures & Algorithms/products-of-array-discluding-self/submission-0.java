class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] ans = new int[nums.length];
        int totalproduct = 1;
        int zeroCount = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                zeroCount++;
            }else{
                totalproduct*=nums[i];
            }
        }
        if(zeroCount >= 2){
            return ans;
        }
        if(zeroCount == 1){
             for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                ans[i] = totalproduct;
            }
            }return ans;
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                ans[i] = totalproduct;
            }else{
                ans[i] = totalproduct/nums[i];
            }
            
        }
        return ans;
    }
}  
