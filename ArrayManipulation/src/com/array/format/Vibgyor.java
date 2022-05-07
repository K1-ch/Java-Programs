package com.array.format;
import java.util.Scanner;
public class Vibgyor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int A[]=new int[n];
		    for(int i=0;i<n;i++){
		        A[i]=sc.nextInt();
		    }
		    int count=0;
		    boolean one=false,two=false,three=false,four=false,five=false,six=false,seven=false;
		    for(int i=0;i<n;i++){
		        if(one==true && two==true && three==true && four==true && five==true && six==true && seven==true){
		            break;
		        }
		        else{
		        if(A[i]==1){
		            one=true;
		            count++;
		        }
		        else if(A[i]==2){
		            two=true;
		            count++;
		        }
		       else if(A[i]==3){
		            three=true;
		            count++;
		        } 
		        else if(A[i]==4){
		            four=true;
		            count++;
		        }
		        else if(A[i]==5){
		            five=true;
		            count++;
		        }
		        else if(A[i]==6){
		            six=true;
		            count++;
		        }
		        else if(A[i]==7){
		            seven=true;
		            count++;
		        }
		        else{
		            count++;
		        }
		    }
		    }
	     System.out.println(count);
		}
}
}
