class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] ans = new int[2];
        if(numbers.length == 2){
            ans[0] = 1;
            ans[1] = 2;
            return ans;
        }
        int left = 0;
        int right = 1;
        boolean check = true;
        while(left < right && right != numbers.length){
            if(numbers[left] + numbers[right] == target){
                ans[0] = left+1;
                ans[1] = right+1;
                return ans;
            }else if((numbers[left] + numbers[right] < target) && check){
                if(right == numbers.length - 1){
                    left++;
                }else{
                    right++;
                }
            }else{
                if(numbers[left+1] + numbers[right] > target){
                    right--;
                    check = false;
                }else{
                    left++;
                }
            }
        }
        return ans;
    }
}
