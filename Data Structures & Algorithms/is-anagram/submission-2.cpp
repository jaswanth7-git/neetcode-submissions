class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size() != t.size()) return false;
        vector<int>first(27 ,0);
        vector<int>second(27 ,0);
        // cout<<'z'-96;
        for(int i = 0 ; i < s.size() ; i++){
            first[s[i]-96] += 1;
        }
         for(int i = 0 ; i < t.size() ; i++){
            second[t[i]-96] += 1;
        }
        for(int i = 0 ; i < second.size() ; i++){
            if(first[i] != second[i]) return false;
        }
        return true;
    }
};
