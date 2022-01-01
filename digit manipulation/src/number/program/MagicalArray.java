/*An array is magical if first and last element is even and sum
of all elements is odd. If array is magical print ‘Yes’ otherwise ‘No’.*/
package number.program;
import java.util.*;
public class MagicalArray {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>=1&&n<=20) {
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		if(a[0]%2==0 && a[n-1]%2==0) {
			for(int i=0;i<n;i++) {
				sum+=a[i];
			}
			if(sum%2!=0)
				System.out.println("Yes");
			else
				System.out.println("No");

		}
		else
			System.out.println("No");
		}
		
	}
}
