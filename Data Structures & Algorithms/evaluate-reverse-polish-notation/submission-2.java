class Solution {
    public static int evalRPN(String[] tokens) {
        int ans = 0;
        if(tokens.length == 1){
            return Integer.parseInt(tokens[0]);
        }
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int num1 = st.pop();
                int num2 = st.pop();
                ans = switch (tokens[i]) {
                    case "+" ->   num1 + num2;
                    case "*" ->   num1 * num2;
                    case "-" ->   num2 - num1;
                    default ->    num2 / num1;
                };
                st.push(ans);
            }else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return ans;
    }
}
