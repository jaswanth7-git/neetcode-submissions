class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.size() > 2) {
                HashMap<Integer, Integer> temp = new HashMap<>();

                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    int count = entry.getValue() - 1;

                    if (count > 0) {
                        temp.put(entry.getKey(), count);
                    }
                }

                map = temp;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int candidate : map.keySet()) {
            int count = 0;

            for (int num : nums) {
                if (num == candidate) {
                    count++;
                }
            }

            if (count > nums.length / 3) {
                ans.add(candidate);
            }
        }

        return ans;
    }
}