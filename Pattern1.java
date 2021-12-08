import java.util.*;
class Pattern1{
public static void main(String[] args){
       int m;
       System.out.println("Enter the num of lines :");
       Scanner sc=new Scanner(System.in);
       m=sc.nextInt();
       for(int i=m;i>0;i--){
           for(int j=i;j>0;j--){
               System.out.print("*");
           }
            System.out.print("\n");
       }
}}