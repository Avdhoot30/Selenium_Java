package main;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray = { 5, 7, 5, 0, 3, 5 };
		int num=numArray.length;
		int average = 0;
	      for(int i =0; i<num; i++){
	         average = average + numArray[i];
	      }

	      average = average/num;
	      System.out.println("Average of given numbers = "+average);
	}
}