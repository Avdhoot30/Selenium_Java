package main;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This website is awesome.";
        char ch = 'e';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);

	}

}
