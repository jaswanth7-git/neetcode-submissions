class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = 0;
        int right = 0;
        List<Integer> newArr = new ArrayList<Integer>();
        while(left < m && right < n){
            if(nums1[left] <= nums2[right]){
                newArr.add(nums1[left]);
                left++;
            }else{
                newArr.add(nums2[right]);
                right++;
            }
        }
        while(left < m){
            newArr.add(nums1[left]);
            left++;
        }
        while(right < n){
            newArr.add(nums2[right]);
            right++;
        }

        for(int i = 0 ; i < newArr.size() ; i++){
            nums1[i] = newArr.get(i);
        }
    }
}