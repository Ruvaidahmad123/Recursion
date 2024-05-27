import java.util.ArrayList;
public class CombinationSumusingRecursion
{ 
    static int arr[]={2,3,6,7};
    public static void f(int idx,int targetsum,ArrayList<Integer>list){
        if(idx==arr.length){ 
            if(targetsum==0){
            System.out.println(list);
            }
            return;
        }
        if(arr[idx]<=targetsum){
        list.add(arr[idx]);
        f(idx,targetsum-arr[idx],list);
        list.remove(list.size()-1);
        }
        f(idx+1,targetsum,list);
    }
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		f(0,7,list);
	}
}