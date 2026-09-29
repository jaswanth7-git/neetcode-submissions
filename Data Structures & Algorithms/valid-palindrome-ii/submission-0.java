class Solution {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {

            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {

                // Try removing left character
                if (isPalindrome(s, l + 1, r)) {
                    return true;
                }

                // Try removing right character
                if (isPalindrome(s, l, r - 1)) {
                    return true;
                }

                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome(String s, int l, int r) {

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}