//to find lcm and hcf of two num
package fundamental;
import java.util.Scanner;
public class Lcm {
	public static void main(String[] args) {
		int n,m,mul,gcd=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		for(int i = 1; i <= n && i <= m; i++) {
		      if(n % i == 0 && m % i == 0)
		        gcd = i;
		    }

		    int lcm = (n * m) / gcd;
	System.out.println(lcm);
	System.out.println(gcd);
			}

}
