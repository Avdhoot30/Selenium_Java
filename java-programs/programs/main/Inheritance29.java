package main;

public class Inheritance29{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        child ob = new child();
        ob.add(); 
        
        
    }
}

class parent
{

    void add()
    {
        System.out.println("Parent class "); 
    }

}
class child extends parent
{

    void add() {
    	super.add();
        System.out.println("Child class ");
    }


}