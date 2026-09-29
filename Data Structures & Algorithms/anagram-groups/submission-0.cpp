class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& v) {
        vector<vector<string>>ans;
         vector<bool> visited(v.size(),false);      
        for(int i = 0; i < v.size() ; i++){
             vector<string>temp;
            if(!visited[i]){
                temp.push_back(v[i]);
                 visited[i] = true;
            }
            for(int j = i+1; j < v.size(); j++){
                if(i!=j && !visited[j] && checkAnagram(v[i],v[j])){
                    visited[j] = true;
                    temp.push_back(v[j]);
                }
            }
            if(temp.size() >= 1){
                ans.push_back(temp);
            }
            
        }return ans;
    }
    bool checkAnagram(string a , string b){
        if(a.size() != b.size()) return false;
        vector<int>ar1(27,0);
        vector<int>ar2(27,0);
        for(auto x : a){
            ar1[x-96]+=1;
        }
        for(auto x : b){
            ar2[x-96]+=1;
        }
        for(int i = 0; i < ar1.size() ; i++){
            if(ar1[i] != ar2[i]){
                return false;
            }
        }return true;
    }
};
