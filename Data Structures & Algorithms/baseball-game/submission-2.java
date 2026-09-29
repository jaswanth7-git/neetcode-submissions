class Solution {
    public int calPoints(String[] operations) {
        int ans = 0;
        Stack<Integer>st = new Stack<>();
        for(int i = 0 ; i < operations.length ; i++){
            if(!operations[i].equals("+") && !operations[i].equals("D") && !operations[i].equals("C") ){
               st.push(Integer.parseInt(operations[i]));
               ans = ans + Integer.parseInt(operations[i]);
            }
            else if(operations[i].equals("+")){
                Integer last_digit = st.pop();
                Integer last_last_digit = st.pop();
                ans += last_digit;
                ans += last_last_digit;
                st.push(last_last_digit);
                st.push(last_digit);
                st.push(last_last_digit + last_digit);
            }else if(operations[i].equals("D")){
                Integer last_digit = st.peek();
                ans = ans + last_digit*2;
                st.push(last_digit*2);
            }else{
                Integer last_digit = st.pop();
                ans = ans - last_digit;
            }
        }return ans;
    }
}