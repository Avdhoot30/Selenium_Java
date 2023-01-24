package main;
abstract class Vehicle {
  abstract void horn();

  public void car() {
    System.out.println("It's a car.");
  }
}

class hornCheck extends Vehicle {

  // provide implementation of abstract method
  public void horn() {
    System.out.println("Horn works");
  }
}

class Abstract {
  public static void main(String[] args) {

    // create an object of Dog class
    hornCheck h = new hornCheck();

    h.horn();
    h.car();
  }
}