class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = 2*nums.length;
        int [] ans = new int[length];
        for(int i = 0 ; i < length ; i++){
            if(i >= nums.length){
                ans[i] = nums[i%nums.length];
            }else{
                ans[i] = nums[i];
            }
        }return ans;
    }
}