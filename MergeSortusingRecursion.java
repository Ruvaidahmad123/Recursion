import java.util.ArrayList;
public class MergeSortusingRecursion
{ 
    public static void merge(int arr[],int low,int mid,int high){
        ArrayList<Integer>temp=new ArrayList<Integer>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            if(arr[left]>=arr[right]){
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
             temp.add(arr[left]);
                left++;
        }
        while(right<=high){
             temp.add(arr[right]);
                right++;
        }
        for(int i=low ;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
    public static void mergesort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid=(high+low)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
	public static void main(String[] args) {
		int arr[]={3,1,2,6,4,4};
		mergesort(arr,0,5);
		for(int x:arr){
		   System.out.print(x+" ");
		}
	}
}
