
public class QuickSort
{   
    public static int partion(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){   //they haven't crossed each other
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    public static void quicksort(int arr[],int low,int high){
        if(low<high){
            int partition=partion(arr,low,high);
            quicksort(arr,low,partition-1);
            quicksort(arr,partition+1,high);
        }
    }
	public static void main(String[] args) {
	    int arr[]={2,4,3,5,1,6};
		quicksort(arr,0,5);
		for(int x:arr){
		    System.out.print(x+" ");
		}
	}
}
