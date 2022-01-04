package arrayformat.com;
import java.util.Scanner;
public class Factor {
	public static void main(String[] args) {
		int n,i=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(i<=n) {
			if(n%i==0)
				System.out.println(i);
			i++;
		}
	}

}
