    class MinStack {
        Deque<Integer> st = new ArrayDeque<>();
        Deque<Integer> minSt = new ArrayDeque<>();
        public MinStack() {

        }

        public void push(int val) {
            if(!minSt.isEmpty()){
                minSt.push(Integer.min(val,minSt.peek()));
            }else{
                minSt.push(val);
            }
            st.push(val);
        }

        public void pop() {
            minSt.pop();
            st.pop();
        }

        public int top() {
            if(st.isEmpty()) return 0;
            return st.peek();
        }

        public int getMin() {
            if(minSt.isEmpty()) return -1;
            return minSt.peek();
        }
    }
