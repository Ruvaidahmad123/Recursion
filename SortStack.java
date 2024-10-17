class GfG {
    public void insert(Stack<Integer> s,int temp){
        if(s.isEmpty() || s.peek()<=temp){
            s.push(temp);
            return;
        }
        int val=s.pop();
        insert(s,temp);
        s.push(val);
    }
    public void sorting(Stack<Integer>s){
        if(s.size()==1){
            return;
        }
        int temp=s.pop();
        sorting(s);
        insert(s,temp);
    }
    public Stack<Integer> sort(Stack<Integer> s) {
        sorting(s);
        return s;
    }
}
