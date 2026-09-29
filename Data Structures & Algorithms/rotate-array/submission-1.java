class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        List<Integer> arr = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        Collections.reverse(arr);
        Collections.reverse(arr.subList(0,k%n));
        Collections.reverse(arr.subList(k%n,arr.size()));
        for (int i = 0 ; i < nums.length; i++){
            nums[i] = arr.get(i);
        }
    }
}