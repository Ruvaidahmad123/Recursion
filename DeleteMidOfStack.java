//TLE
class Solution {
    public void delete(Stack<Integer> s,int idx_to_delete,int count){
        if(count==idx_to_delete){
            s.pop();
            return;
        }
        int temp=s.pop();
        delete(s,idx_to_delete,count+1);
        s.push(temp);
    } 
    public void deleteMid(Stack<Integer> s, int size) {
        int idx_to_delete=(size)/2;
        delete(s,idx_to_delete,0);
    }
}

//Better
class Solution {
    public void deleteMid(Stack<Integer> s, int size) {
        int idx_to_delete = size / 2;
        Stack<Integer> tempStack = new Stack<>();
        for (int i = 0; i < idx_to_delete; i++) {
            tempStack.push(s.pop());
        }
        s.pop();
        while (!tempStack.isEmpty()) {
            s.push(tempStack.pop());
        }
    }
}
