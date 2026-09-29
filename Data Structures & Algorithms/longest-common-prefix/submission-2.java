class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)return strs[0];
        int count = 0;
        int string_index = 0;
        while(true){
            int start = 0;
            if(string_index < strs[start].length()){
                char first_char = strs[start].charAt(string_index);
                while(start+1 < strs.length && string_index < strs[start+1].length() && first_char == strs[start+1].charAt(string_index)){
                    start++;
                    if(start == strs.length - 1){
                        count++;
                    }
                }
                if(count == 0){
                    return "";
                }
                string_index++;
            }else{
                return strs[0].substring(0,count);
            }
        }
    }
}