import java.util.*;
   class CombinationSumWithUniqueSubset{
    static ArrayList<List<Integer>>ans=new ArrayList<List<Integer>>();
     public static void f(int idx,int target,int arr[],ArrayList<Integer>list){
            if(target==0){
                ans.add(new ArrayList<Integer>(list));
                return;
            }
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) continue; // Skip duplicates i>= index isliye nahi kara because index waale ko toh lena hai agar usko nahi lenge toh hm miss kardenge subset and i>index isliye kara taaki remove kar sake aage aane waale duplicates ko
            // and i=index ka matlab  pehla element aaya hai so we can pick i>index matlab dupliacate
            if (arr[i] > target) break; // No need to continue if the current number is greater than the remaining target
            list.add(arr[i]);
            f(i + 1, target - arr[i], arr, list);
            list.remove(list.size() - 1); // Backtrack
        }
        
    }
    public static void main(String args[]){
        int nums[]={10,1,2,7,6,1,5};
        int target=8;
        ans.clear();
        Arrays.sort(nums);
        f(0,target,nums,new ArrayList<>());
        System.out.println(ans);
    }
}