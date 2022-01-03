package number.program;
import java.util.*;
public class Perfectsqr {
public static void main(String[] args) {
	int n,sum=0;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=(int)Math.pow(7, i);
	} 
	for(int i=0;i<n;i++) {
	 System.out.println(a[i]);
 sum++;
	}
}
}
