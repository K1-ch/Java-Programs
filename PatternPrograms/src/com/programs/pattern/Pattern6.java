import java.util.*;
class Pattern6{
    public static void main(String [] args){
        int n,i,j;
        System.out.println("Enter the no. of lines");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       for(i=0;i<n;i++){
           for(j=0;j<i;j++){
               System.out.print(" ");
           }
            System.out.print("*" );
       }
 System.out.print("\n" );
    }
}