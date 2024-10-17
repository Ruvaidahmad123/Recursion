class Solution {
    long mod = (long) 1e9 + 7;
    long getAns(int n, int r) {
        if (r == 0) {
            return 1; // Base case
        }
        if (r % 2 == 1) {
            return (n * getAns(n, r - 1)) % mod; 
        } else {
            long half = getAns(n, r / 2); 
            return (half * half) % mod;
        }
    }

    long power(int N, int R) {
        return getAns(N , R)%mod; 
    }
}
