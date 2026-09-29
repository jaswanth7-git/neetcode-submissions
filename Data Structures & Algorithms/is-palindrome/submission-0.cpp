class Solution {
public:
    bool isPalindrome(string s) {
        string newstr = "";
        for(int i  = 0 ; i < s.size() ; i++){
            if(isValidChar(s[i])){
                newstr+=s[i];
            }
        }
        std::transform(newstr.begin(), newstr.end(), newstr.begin(), ::tolower);
        // cout<<newstr;
        int start = 0;
        int end = newstr.size() - 1;
        while(start < end){
            if(newstr[start] != newstr[end]) return false;
            start++;
            end--;
        } 
        return true;
    }
    bool isValidChar(char a){
        if((int(a) >= 48 && int(a) <= 57) || (int(a) >= 65 && int(a) <= 90) || (int(a) >= 97 && int(a) <= 122)) return true;
        return false;
    }
};
