class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.size() == 0)return 0;
        if(nums.size() == 0)return 1;
        map<int,int>mp;
        for(int i = 0 ; i < nums.size() ; i++){
            mp[nums[i]]+=1;
        }
        int ans = 0;
        for(int i = 0; i < nums.size() ; i++){
            bool flag = true;
            int ele = nums[i];
            int tempans = 0;
            while(flag){
                ele++;
                if(mp.count(ele)){
                    tempans++;
                }else{
                    break;
                }
            }ans = max(ans,tempans);
        }
        return ans+1;
    }
};
