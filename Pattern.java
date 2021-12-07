import java.util.*;
 class Pattern{
    public static void main(String[] args){
        int x,i,j;
        System.out.println("Enter the numer of lines");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        for(i=1;i<=x;i++){
            for(j=1;j<=i;j++){
                 System.out.print("*");  
            }
             System.out.print("\n");  
        }

    }
}