class Solution {
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Deque<ArrayList<Integer>> st = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++) {

            while (!st.isEmpty() && temperatures[i] > st.peek().get(1)) {
                ArrayList<Integer> top = st.pop();
                ans[top.get(0)] = i - top.get(0);
            }

            st.push(new ArrayList<>(List.of(i, temperatures[i])));
        }

        return ans;
    }
}