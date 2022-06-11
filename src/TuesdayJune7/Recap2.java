package TuesdayJune7;

public class Recap2 {

	public static void main(String[] args) {
		
		
		String str="Where is sameer?";
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("e"));
		
		System.out.println(str.indexOf("r",6));
		
		int counter=0;
		for(int i=0; i<str.length();i++) {
			
			if(str.charAt(i)==2) {
				System.out.println(i);
			}
		}

	}

}
