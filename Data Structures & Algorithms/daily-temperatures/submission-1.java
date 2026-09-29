class Solution {
    public static int[] dailyTemperatures(int[] temperatures) {
            int[] ans = new int[temperatures.length];
            Deque<ArrayList<Integer>>st = new ArrayDeque<>();
            for(int i = 0 ; i < temperatures.length ; i++){
                if(st.isEmpty()){
                    ArrayList<Integer>tup = new ArrayList<>();
                    tup.add(i);
                    tup.add(temperatures[i]);
                    st.push(tup);
                }else{
                    if(temperatures[i] > st.peek().get(1)){
                        while(!st.isEmpty() && temperatures[i] > st.peek().get(1)){
                            ArrayList<Integer> top = st.pop();
                            ans[top.getFirst()] = i - top.getFirst();
                        }
                      
                    }
                   else if(temperatures[i] < st.peek().getLast()){
                        // st.push(new ArrayList<>(List.of(i,temperatures[i])));
                    }
                      st.push(new ArrayList<>(List.of(i, temperatures[i])));

                }

            }
            return ans;
    }
}
