package Stringprograms.com;
import java.util.*;
public class RemoveDup { 
	    public static void removeDuplicates(String str)   
	    {   
	        String newstr = new String();
	       
	        int length = str.length();
	        for (int i = 0; i < length; i++)    
	        {   
	            char charAtPosition = str.charAt(i);   
	            if (newstr.indexOf(charAtPosition) < 0)   
	            {
	                newstr += charAtPosition;   
	            }   
	        }     
	        System.out.println(newstr);  
	    }   
	    public static void main(String[] args)   
	    {   
	    	 Scanner sc=new Scanner(System.in);
	        String str =sc.nextLine();
	        removeDuplicates(str);   


	}

}
