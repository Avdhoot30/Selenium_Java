package main;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "madam";  
	        int flag = 0;
	        for(int i = 0; i < s.length()/2; i++){  
	            if(s.charAt(i) != s.charAt(s.length()-i-1)){  
	                flag = 1;  
	                break;  
	            }  
	        }  
	        if(flag==0)  
	            System.out.println("Given string is palindrome");  
	        else  
	            System.out.println("Given string is not a palindrome");  
	    }  
	}