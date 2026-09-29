class StockSpanner {
    Deque<List<Integer>>stack = new ArrayDeque<>(); 
    public StockSpanner() {
       
    }
    
    public int next(int price) {
        int ans = 1;
        while(!stack.isEmpty() && price >= stack.peek().get(0)){
            ans += stack.pop().get(1);
        }
        stack.push(List.of(price,ans));
        return ans;
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */