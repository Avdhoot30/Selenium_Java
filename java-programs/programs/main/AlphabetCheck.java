package main;

public class AlphabetCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = '*';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");

	}

}
