package main;

interface Car {
	
	}
	
	 class Bike implements Car {
		public static void runs() {
			System.out.println("It Runs!");
		}

}
public class Car1{
	public static void main(String args[]) {
		Bike.runs();
	}
}