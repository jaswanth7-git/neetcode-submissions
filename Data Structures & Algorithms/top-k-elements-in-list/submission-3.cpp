class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        map<int,int>mp;
        map<int,vector<int>>freq;
       for(int i = 0; i < nums.size(); i++){
            mp[nums[i]]+=1;
       }
       for(auto x : mp){
           freq[x.second].push_back(x.first);
       }
       int n = nums.size();
       vector<int>ans;
        while(n > 0 && k>0){
            if(freq.count(n)){
                for(auto x : freq[n]){
                    ans.push_back(x);
                    k--;
                }
            }n--;
        }
       return ans;
    }
};

