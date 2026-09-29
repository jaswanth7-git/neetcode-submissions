class Solution {
    public String longestCommonPrefix(String[] strs) {

        int index = 0;

        while (true) {

            // Check first string boundary
            if (index >= strs[0].length()) {
                return strs[0].substring(0, index);
            }

            char ch = strs[0].charAt(index);

            // Compare with all other strings
            for (int i = 1; i < strs.length; i++) {

                // Boundary check for every string
                if (index >= strs[i].length() || strs[i].charAt(index) != ch) {
                    return strs[0].substring(0, index);
                }
            }

            index++;
        }
    }
}