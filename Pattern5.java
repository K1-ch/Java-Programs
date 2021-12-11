import java.util.*;
class Pattern5{
    public static void main(String[] args){
        int n,i,j;
        System.out.println("Enter the num of lines");
          Scanner sc=new Scanner(System.in);
          n=sc.nextInt();
          for(i=0;i<n;i++){
                    for(j=1;j<=((i*n-1)-(2*i-1));j++){
        
              
               System.out.print("*"); 
          }
           System.out.print("\n");}
    }
}