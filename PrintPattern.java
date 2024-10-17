class Solution{
    List<Integer>ans=new ArrayList<>();
    int global;
    public void print(int N,boolean value){
        if(N==global)return;
        ans.add(N);
        if(N>0 && value==true)
        print(N-5,true);
        else
        print(N+5,false);
    }
    public List<Integer> pattern(int N){
        if(N<=0){
            ans.add(N);
            return ans;
        }
        global=N;
        ans.add(N);
        print(N-5,true);
        ans.add(N);
        return ans;
    }
}
