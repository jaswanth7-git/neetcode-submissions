class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer>windowSet = new HashSet<>();
        int l = 0;
        for(int r = 0 ; r < nums.length ; r++){
            if(r-l > k){
                windowSet.remove(nums[l]);
                l++;
            }
            if(windowSet.contains(nums[r])){
                return true;
            }
            windowSet.add(nums[r]);
        }return false;
    }
}