class Solution {
    boolean ans = false;

    void isSum(String s, int index, int x, int y) {
        if (index == s.length()) {
            ans = true;
            return;
        } else if (index > s.length()) {
            return;
        }

        int z = 0;
        for (int j = index; j < s.length(); j++) {
            z = (z * 10) + (s.charAt(j) - '0');
            // Check for leading zeros in the next part
            if (j + 1 < s.length() && s.charAt(j + 1) == '0') continue;
            if (z == x + y) {
                isSum(s, j + 1, y, z);
            }
        }
    }

    int isSumString(String s) {
        if (s.length() < 3) return 0;
        int n = s.length();
        int x = 0;

        for (int i = 0; i < n - 2; i++) {
            x = x * 10 + (s.charAt(i) - '0');
            // Check for leading zeros in the next part
            if (i + 1 < n && s.charAt(i + 1) == '0') continue;

            int y = 0;
            for (int j = i + 1; j < n - 1; j++) {
                y = y * 10 + (s.charAt(j) - '0');
                // Check for leading zeros in the next part
                if (j + 1 < n && s.charAt(j + 1) == '0') continue;

                isSum(s, j + 1, x, y);
            }
        }
        return ans ? 1 : 0;
    }
}
