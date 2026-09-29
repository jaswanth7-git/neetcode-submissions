class Solution {

    public String encode(List<String> strs) {
        String ans = "";
        for(int i = 0 ; i < strs.size() ; i++){
            ans += strs.get(i);
            ans += "#jas#";
        }
        if(ans == ""){
            return null;
        }
        return ans;
    }

    public List<String> decode(String str) {
        
        List<String> ans = new ArrayList<>();
        if(str == null){
            // ans.add("");
            return ans;
        }
        String[] tempans = str.split("#jas#");
        System.out.print(tempans.length);
             if(tempans.length == 0){
            ans.add("");
            return ans;
        }
        for(int i = 0 ; i < tempans.length ; i++){
            ans.add(tempans[i]);
        }
        return ans;
    }
}
