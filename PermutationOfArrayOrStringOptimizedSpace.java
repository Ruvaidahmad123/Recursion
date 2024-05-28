import java.util.*;
class PermutationOfArrayOrStringOptimizedSpace {
    public static void swap(int a,int b,int []arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void f(int idx,int arr[]){
        if(idx==arr.length){
            ArrayList<Integer>list=new ArrayList<>();
            for(int x:arr)
            list.add(x);
            System.out.println(list);
            return;
        }
        for(int i=idx;i<arr.length;i++){
            swap(idx,i,arr);
            f(idx+1,arr);
            swap(idx,i,arr);
        }
    }
    
    public static void main(String args[]){
        int arr[]={1,2,3};
        f(0,arr);
    }
}