class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0 ; i < matrix.length ; i++){
            if(search(matrix[i],target) != -1)return true;
        }return false;
    }

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] > target) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }return -1;
    }
}
