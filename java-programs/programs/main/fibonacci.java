package main;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	    int num = sc.nextInt();
	    int  first=0, second=1;
	    System.out.println("Fibonacci Series is ");
	    for (int i=1; i<=num; i++) {
	      System.out.print(first + ", ");
	      int temp = first + second;
	      first = second;
	      second = temp;
	    }
	  }
	}


