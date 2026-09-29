class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // Get to the time which takes for each car to reach target.
        float[] times = new float[position.length];
        for(int i = 0; i < position.length; i++) {
            times[i] = (float)(target-position[i])/(float)speed[i];
        }

        // Sort cars by their distance from target -- descending 
        float[][] carPos = new float[position.length][2];
        for(int i = 0; i < position.length; i++) {
            carPos[i][0] = times[i];
            carPos[i][1] = position[i];
        }
        Arrays.sort(carPos, (a, b) -> Float.compare(a[1], b[1]));

        // Process each cars and find the answer
        Stack<Float> s = new Stack<>();
        for (float[] c : carPos) {
            if(s.empty()) s.push(c[0]);
            else {
                while(!s.isEmpty() && c[0] >= s.peek()) {
                    s.pop();
                }
                s.push(c[0]);
            }
        }
        return s.size();
    }
}


