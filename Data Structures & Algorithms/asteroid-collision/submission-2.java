class Solution {
    public static int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int ast : asteroids) {
            boolean alive = true;

            // Collisions only happen if the asteroid moves left (ast < 0) 
            // and the top of the stack moves right (stack.peek() > 0)
            while (alive && ast < 0 && !stack.isEmpty() && stack.peek() > 0) {
                int top = stack.peek();
                if (top < -ast) {
                    // Incoming asteroid destroys the top one and continues
                    stack.pop();
                } else if (top == -ast) {
                    // Both destroy each other
                    stack.pop();
                    alive = false;
                } else {
                    // Top asteroid destroys the incoming one
                    alive = false;
                }
            }

            // If the incoming asteroid wasn't destroyed, add it to the stack
            if (alive) {
                stack.push(ast);
            }
        }

        // Deque (as a stack) pops in LIFO order
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}
