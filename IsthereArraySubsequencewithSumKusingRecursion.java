import java.util.ArrayList;
public class IsthereArraySubsequencewithSumKusingRecursion
{ 
    static int arr[]={3,1,2};
    public static boolean f(int idx,ArrayList<Integer>list){
        if(idx==arr.length){
            int sum=0;
            for(int x:list){
                sum+=x;
            }
            if(sum==3){
            System.out.println(list);
            return true;
            }
            else
            return false;
        }
        list.add(arr[idx]);
        if(f(idx+1,list)==true)
            return true;
        list.remove(list.size()-1);
        if(f(idx+1,list)==true)
            return true;
        return false;
    }
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		boolean flag=f(0,list);
		System.out.println(flag);
	}
}
