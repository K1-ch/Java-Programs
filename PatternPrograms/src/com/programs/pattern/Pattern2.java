import java.util.*;
class Pattern2{
public static void main(String[] args){
 int m,i,j;
 System.out.println("Enter the no. of lines");
 Scanner sc=new Scanner(System.in);
 m=sc.nextInt();

     for( j=i;j>0;j--){
          for( i=m;i>0;i--){
         System.out.print(" ");
         System.out.print("*");
     }
     System.out.print("\n");
 }
}}