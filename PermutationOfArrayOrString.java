import java.util.*;
class PermutationOfArrayOrString {
    public static void f(ArrayList<Integer>list,boolean freq[],int arr[]){
        if(list.size()==arr.length){
            System.out.println(list);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(freq[i]!=true){
                freq[i]=true;
                list.add(arr[i]);
                f(list,freq,arr);
                list.remove(list.size()-1);
                freq[i]=false;
            }
        }
    }
    
    public static void main(String args[]){
        int arr[]={1,2,3};
        boolean freq[]=new boolean[arr.length];
        f(new ArrayList<Integer>(),freq,arr);
    }
}