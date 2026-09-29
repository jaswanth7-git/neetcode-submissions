class Solution {
public:
    int characterReplacement(string s, int k) {
        int start,end = 0;
        vector<int>freq(27,0);
        int ans = 0;
        int maxfreq = 0;
        while(end < s.size()){
            freq[int(s[end])-'A']+=1;
            int length = end-start+1;
            maxfreq = max(maxfreq,freq[int(s[end])-'A']);
            if(length - maxfreq <= k){
                ans = max(ans,length);
            }else{
               while ((end - start + 1) - maxfreq > k) {
                    freq[int(s[start]) - 'A'] -= 1;
                    start++;
                }
            } end++;
        }
        return ans;
    }
};
