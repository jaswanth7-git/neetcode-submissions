class Solution {
public:
    int maxProfit(vector<int>& nums) {
        int mini = nums[0];
        int ans = 0;
        for(int i = 0 ; i < nums.size() ; i++){
            mini = min(mini ,nums[i]);
            int profit = nums[i]-mini;
            ans = max(profit,ans);
        }return ans;
    }
};
