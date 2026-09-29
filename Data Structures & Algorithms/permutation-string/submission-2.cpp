class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        if(s1.length() > s2.length()){
            return false;
        }else{
            for(int i = 0 ; i < s2.length() ; i++){
                if(checkPermutation(s2.substr(i,s1.length()),s1)) return true;
            }return false;
        }
    }
    bool checkPermutation(string s1, string s2){
        if(s1.length() != s2.length()) return false;
        map<char,int>mp1;
        map<char,int>mp2;
        for(int i = 0 ; i < s1.length(); i++){
            mp1[s1[i]]+=1;
            mp2[s2[i]]+=1;
        }
        for(int i = 0 ; i < s1.length(); i++){
            if(mp1[s1[i]] != mp2[s1[i]]) return false;
        }
        return true;
    }
};
