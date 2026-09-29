class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int ans = 0;
        Arrays.sort(people);
        int left = 0;
        int right = people.length-1;
        while(left < right){
            if(people[left]+people[right] <= limit){
                ans+=1;
                left++;
                right--;
            }else{
                ans+=1;
                right--;
            }
        }
        if(left == right) ans+=1;
        return ans;
    }
}