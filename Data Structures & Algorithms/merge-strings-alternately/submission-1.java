class Solution {
    public String mergeAlternately(String word1, String word2) {
        int one = 0;
        int two = 0;
        String ans = "";
        while(one != word1.length() && two != word2.length()){
             ans+=word1.charAt(one);
             ans+=word2.charAt(two);
             one++;
             two++;
        }
        while(one != word1.length()){
            ans+=word1.charAt(one);
            one++;
        }
        while(two != word2.length()){
            ans+=word2.charAt(two);
            two++;
        }
        return ans;
    }
}