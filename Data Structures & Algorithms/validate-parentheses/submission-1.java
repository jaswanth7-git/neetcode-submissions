class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(st.empty() && !isOpener(s.charAt(i))){
                return false;
            }
            if(isOpener(s.charAt(i))){
                st.push(s.charAt(i));
            }
            else{
                if(isPair(st.peek(),s.charAt(i))){
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }
            }
        }
        return st.empty();
    }
    public boolean isPair(char start, char end){
        if(start == '{' && end == '}'){
            return true;
        }else if(start == '(' && end == ')'){
            return true;
        }else if(start == '[' && end == ']'){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isOpener(char start){
        if(start == '{' || start == '[' || start == '('){
            return true;
        }
        return false;
    }
}