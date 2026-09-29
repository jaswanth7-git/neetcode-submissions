class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer>mp = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            mp.put(nums[i],1);
        }
        int ans = 0;
        for(int key : mp.keySet()){
            int tempans = 1;
            int nextindex = key;
            while(mp.containsKey(nextindex+1)){
                nextindex+=1;
                tempans+=1;
            }ans = Math.max(tempans,ans);
        }
        return ans;
    }
}
