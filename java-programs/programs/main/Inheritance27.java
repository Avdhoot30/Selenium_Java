package main;

class  Veg{
	
	public void Menu() {
		System.out.println("We serve only veg!");
	}
	
}
class Paneer1 extends Veg {
	public void taste() {
		System.out.println("It's Tasty!!");
	}
}

class Inheritance27 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veg p = new Veg();
		p.Menu();
		p=new Paneer1();
		((Paneer1) p).taste();

	}
}