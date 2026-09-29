class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        if(nums.length == 1)return nums[0];
        int currEle = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            if(currEle == nums[i]){
                count++;
                if(count == nums.length/2){
                    return nums[i];
                }
            }else{
                count--;
            }
            if(count < 0){
                currEle = nums[i];
            }
        }
        return currEle;
    }
}