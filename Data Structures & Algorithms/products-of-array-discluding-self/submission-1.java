class Solution {
    // public int[] productExceptSelf(int[] nums) {
    //     int [] ans = new int[nums.length];
    //     int totalproduct = 1;
    //     int zeroCount = 0;
    //     for(int i = 0 ; i < nums.length ; i++){
    //         if(nums[i] == 0){
    //             zeroCount++;
    //         }else{
    //             totalproduct*=nums[i];
    //         }
    //     }
    //     if(zeroCount >= 2){
    //         return ans;
    //     }
    //     if(zeroCount == 1){
    //          for(int i = 0 ; i < nums.length ; i++){
    //         if(nums[i] == 0){
    //             ans[i] = totalproduct;
    //         }
    //         }return ans;
    //     }

    //     for(int i = 0 ; i < nums.length ; i++){
    //         if(nums[i] == 0){
    //             ans[i] = totalproduct;
    //         }else{
    //             ans[i] = totalproduct/nums[i];
    //         }
            
    //     }
    //     return ans;
    // }
    public int[] productExceptSelf(int[] nums) {
        int [] left = new int[nums.length];
        int [] right = new int[nums.length];
        left[0] = 1;
        right[nums.length - 1] = 1;
        int [] ans = new int[nums.length];

        for(int i = 1 ; i < nums.length ;i++){
            left[i] = nums[i-1]*left[i-1];
        }
        for(int i = nums.length-2; i >= 0 ;i--){
            right[i] = nums[i+1]*right[i+1];
        }
        for(int i = 0 ; i < nums.length; i++){
            ans[i] = left[i]*right[i];
        }return ans;
    }
}  
