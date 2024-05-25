/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class PalindromeCheckusingRecursion
{ 
    public static boolean palindromecheck(String str,int l, int r){
        if(l>r){   //also u can do till l<=n/2
            return true;
        }
        if(str.charAt(l)!=str.charAt(r))
            return false;
        return palindromecheck(str,l+1,r-1);
    }
	public static void main(String[] args) {
	    String str="MADAM";
	    int l=0;
	    int r=str.length()-1;
		boolean check=palindromecheck(str,l,r);
		System.out.print(check);
	}
}
