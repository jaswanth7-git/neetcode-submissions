class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int>mp;
        for(int i = 0; i < nums.size(); i++){
            mp[nums[i]]+=1;
        }
        int ansindex = -1;
        for(int i = 0; i < nums.size(); i++){
            if(mp.count(target-nums[i])){
                ansindex = i;
            }
        }
        // cout<<"ans index "<<ansindex<<" ";
        vector<int>ans;
        for(int i = 0 ; i < nums.size(); i++){
            if(nums[ansindex]+nums[i] == target){
                ans.push_back(ansindex);
                ans.push_back(i);
                sort(ans.begin(),ans.end());
                return ans;
            }
        }return ans;
    }
};
