package com.array.format;

public class ArraySort {
	
	public static void main(String[] args) {
	
		int tmp;
	    int[] k= {4,2,1};
			for(int q=0;q<k.length;q++){
            for(int r=q;r<k.length;r++){
                if(k[q]>k[r]){
                    tmp=k[q];
                    k[q]=k[r];
                    k[r]=tmp;
                }
            }
    	}  
		
		for(int i=1;i<k.length-1;i++) {
		if(k[i]<=k[k.length-1])
			System.out.println("win");
		else
		System.out.println("loose");

			
		}
			}

}
