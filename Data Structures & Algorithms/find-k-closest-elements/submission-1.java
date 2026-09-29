class Pair {
    int element;
    int distance;

    Pair(int element, int distance) {
        this.element = element;
        this.distance = distance;
    }
}
class Solution {
    // public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
    //     PriorityQueue<Pair>pq = new PriorityQueue<>((a, b) -> {
    //             if (a.distance != b.distance) {
    //                 return a.distance - b.distance;
    //             }
    //             return a.element - b.element;
    //         });
    //     for(int i = 0 ; i < arr.length ; i++){
    //         pq.add(new Pair(arr[i],Math.abs(arr[i] - x)));
    //     }
    //     List<Integer> ans = new ArrayList<>();
    //     for(int i = 0 ; i < k ; i++){
    //         ans.add(pq.peek().element);
    //         pq.poll();
    //     }
    //     Collections.sort(ans);
    //     return ans;
    // }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - k;
        int mid = left + (right - left) / 2;
        while (left < right) {
            mid = left + (right - left) / 2;

            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = left ; i < left+k ; i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}