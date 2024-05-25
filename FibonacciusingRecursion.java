
public class FibonacciusingRecursion
{ 
    public static int fiboancci(int n){
        if(n<=1){   
            return n;
        }
        return fiboancci(n-1)+fiboancci(n-2);
    }
	public static void main(String[] args) {
		System.out.print(fiboancci(4));
	}
}
