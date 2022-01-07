package number.program;
import java.util.*;
public class StrongNum {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int j=1;j<=n;j++) {
		int sum=0,rem=0;
		int tmp=j;
		while(tmp>0) {
			int fact=1;
			rem=tmp%10;
			tmp=tmp/10;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			
		}
		if(sum==j) {
			System.out.print(j+" ");
			
		}
		}
	}

}
