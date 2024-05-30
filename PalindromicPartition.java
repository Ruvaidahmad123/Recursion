import java.util.*;
class PalindromicPartition
{
    public static List < List < String >>partition(String s){
       List < List < String >> ans=new ArrayList < List < String >>();
       List < String >res=new ArrayList<String>();
       helper(0,ans,res,s);
       return ans;
    }
    public static void helper(int idx,List< List < String >>ans,List < String >res,String s){
        if(idx==s.length()){
            ans.add(new ArrayList<String>(res));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s,idx,i)){
                res.add(s.substring(idx,i+1));
                helper(i+1,ans,res,s);
                res.remove(res.size()-1);
            }
        }
    }
    static boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
    public static void main(String args[]) {
        String s = "aabb";
        List < List < String >> ans = partition(s);
        int n = ans.size();
        System.out.println("The Palindromic partitions are :-");
        System.out.print(" [ ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("[ ");
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.print("] ");
        }
        System.out.print("]");


    }
}