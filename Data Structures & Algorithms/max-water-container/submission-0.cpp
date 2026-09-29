class Solution {
public:
    int maxArea(vector<int>& nums) {
        int start = 0;
        int end = nums.size() - 1;
        int ans = 0;
        while(start < end){
            int area = (end-start)*min(nums[start],nums[end]);
            cout<<area;
            ans = max(area,ans);
            if(nums[end]>=nums[start]){
                start++;
            }else{
                end--;
            }
        }  return ans;
    }
};
