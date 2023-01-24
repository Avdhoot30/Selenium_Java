package main;

import java.util.Scanner;

public class prime {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
	    int num = sc.nextInt ();
	    int cnt=0;
	    for (int i=2; i<=num/2; i++) {
	    	if (num % i == 0) {
	    		cnt++;
				break;
	    	}
	    }
	    	if(cnt==1) {
	    		System.out.println (num + " is not a Prime number");
	    	}
	    	else {
	    		System.out.println (num + " is a Prime number");
	    	}
	      
	  }
		
	}

