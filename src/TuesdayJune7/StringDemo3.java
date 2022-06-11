package TuesdayJune7;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String str="l;ajsdfdf0987109348574@$##asKLJHKLJHASD%#@%#$((#$%^7";
		
		System.out.println(str.replaceAll("[0-9]", "#"));
		System.out.println(str.replaceAll("[a-z]", "#"));
		System.out.println(str.replaceAll("[A-Z]", "#"));
		System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));
		System.out.println(str.replaceAll("[^a-z]", "_")); //other than a-z is ___
		System.out.println(str.replaceAll("[^A-Z]", "*")); //other than A-Z ****
		System.out.println(str.replaceAll("[A-Za-z0-9]","*"));
		str="abcdefghijkl";
		System.out.println(str.replaceAll("[a-f]", "*"));
		str="l;ajsdfdf0987109348574@$##asKLJHKLJHASD%#@%#$((#$%^7";
		System.out.println(str.replaceAll("[^A-z]", "")); //remove special characters
		
	}

}
