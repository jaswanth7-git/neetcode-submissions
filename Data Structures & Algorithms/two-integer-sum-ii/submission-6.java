class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length - 1;
        int [] ans = new int[2];

        while(s < e){
            int sum = numbers[s]+numbers[e];
            if(numbers[s]+numbers[e] == target){
                ans[0] = s+1;
                ans[1] = e+1;
                return ans;
            } else if (numbers[s] + numbers[e] < target) {
                s++;
            }else{
                e--;
            }
        }

        return ans;
    }
}