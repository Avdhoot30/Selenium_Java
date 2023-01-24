package main;

public class ChartoStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'c';
        String s = Character.toString(c);
        System.out.println("The string is: " + s);
        
        String ch = "Hello";

        for(int i=0; i<ch.length();i++){  
            char d = ch.charAt(i);  
            System.out.println("char at "+i+" index is: "+d);  
    }  
	}
}
