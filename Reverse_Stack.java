class Solution
{ 
    static void insert(Stack<Integer> s,int temp){
        if(s.isEmpty()){
            s.push(temp);
            return;
        }
        int val=s.pop();
        insert(s,temp);
        s.push(val);
    }
    static void reverse(Stack<Integer> s)
    {
        if(s.size()==1){
            return;
        }
        int temp=s.pop();
        reverse(s);
        insert(s,temp);
    }
}
