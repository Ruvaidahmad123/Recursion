/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class ReverseusingRecursion
{ 
    public static int[] reverse(int[] arr,int l, int r){
        if(l>r){   //also u can do till l<=n/2
            return arr;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        return reverse(arr,l+1,r-1);
    }
	public static void main(String[] args) {
	    int arr[]={2,3,5,7};
	    int l=0;
	    int r=arr.length-1;
		int rev[]=reverse(arr,l,r);
		for(int x:rev){
		   System.out.print(x+" ");
		}
	}
}
