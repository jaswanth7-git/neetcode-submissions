class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        if(s.size() == 0)return 0;
        if(s.size() == 1)return 1;
        int start = 0;
        map<int,int>mp;
        int ans = 0;
        for(int e = 0 ; e < s.size() ; e++){
            if(mp.count(s[e]) && mp[s[e]] >= start){
                start = mp[s[e]] + 1;

            }
            mp[s[e]] = e;
            ans = max(ans , e-start + 1);
        }
        return ans;
    }
};
