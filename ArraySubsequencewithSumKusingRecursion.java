import java.util.ArrayList;
public class ArraySubsequencewithSumKusingRecursion
{ 
    static int arr[]={3,1,2};
    public static void f(int idx,ArrayList<Integer>list){
        if(idx==arr.length){
            int sum=0;
            for(int x:list){
                sum+=x;
            }
            if(sum==3)
            System.out.println(list);
            return;
        }
        list.add(arr[idx]);
        f(idx+1,list);
        list.remove(list.size()-1);
        f(idx+1,list);
        
    }
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		f(0,list);
	}
}
