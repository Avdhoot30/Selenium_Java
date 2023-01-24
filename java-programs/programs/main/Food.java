package main;

public class Food {
	
	public void Menu() {
		System.out.println("We serve only veg!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paneer p = new Paneer();
		p.Menu();
		p.taste();

	}

}
class Paneer extends Food {
	public void taste() {
		System.out.println("It's Tasty!!");
	}
}