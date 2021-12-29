//Declare,initialize and create an array
package arrayformat.com;
public class Array {
	public static void main(String[] args) {
		int []y={1,2,8,9,5};
		int [][]x= {{1,2,3,4,5},{9,0}};
		System.out.println(y);
		System.out.println(y[4]);
		System.out.println(x[1][0]);//print a number at a specified position
		System.out.println(x);//print corresponding class
		int [][]m= {{1,2,3},{7,9,8,4}};
		System.out.println(m[1][3]);
		//Arrays of array concept in single line
		int [][]p= {{1,4,7,9},{6,0,4},{2,4},{10}};
		System.out.println(p[1][0]);
		System.out.println(m);//print corresponding class
	}

}
