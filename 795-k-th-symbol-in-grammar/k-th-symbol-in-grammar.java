class Solution {
    public int kthGrammar(int n, int k) {
        // Base case
        if (n == 0 || n == 1) {
            return 0;
        }
        // Calculate the middle index
        int mid = (int) Math.pow(2, n - 1) / 2;
        // Recursive logic based on the value of k
        if (k <= mid) {
            return kthGrammar(n - 1, k);
        } else {
            return 1 - kthGrammar(n - 1, k - mid);
        }
    }
}