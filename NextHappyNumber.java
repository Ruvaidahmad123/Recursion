class Solution{
    public static int check(int n){
        int sum=0;
        while(n!=0){
           int lastdig=n%10;
           sum=sum+lastdig*lastdig;
           
           n=n/10; 
        }
        return sum;
    }
    public static boolean isHappy(int N){
        int fast=N;
        int slow=N;
        do{
            slow=check(slow);
            fast=check(check(fast));
        }
        while(slow!=fast);
        return slow==1;
    }
    static int nextHappy(int N){
        while(true){
            N++;
            if(isHappy(N))break;
        }
        return N;
    }
}
