class Pair {
    int element;
    int distance;

    Pair(int element, int distance) {
        this.element = element;
        this.distance = distance;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        PriorityQueue<Pair>pq = new PriorityQueue<>((a, b) -> {
                if (a.distance != b.distance) {
                    return a.distance - b.distance;
                }
                return a.element - b.element;
            });
        for(int i = 0 ; i < arr.length ; i++){
            pq.add(new Pair(arr[i],Math.abs(arr[i] - x)));
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < k ; i++){
            ans.add(pq.peek().element);
            pq.poll();
        }
        Collections.sort(ans);
        return ans;
    }
}