package TuesdayJune7;

public class Recap {
	
	public static void main(String[] args) {

	
	//String =>DataType/Class
	//str=> variable name/ object/instance
	// = => is used to create objects
	//String(); it's also like a method it contains some
	//java statements which are executed when object of this
	//class is created
	
	String str="Batch 13 is greate but I say this to every batch. i was kidding";
	int len=str.length();
	System.out.println(str.toUpperCase());
	str=str.toUpperCase();
	System.out.println(str);
	str=" ";
	System.out.println(str.isEmpty());
	
	String str2="Tara                ";
	System.out.println(str2.trim());
	str="Bath 13 is great but i say this to every batch. i was kidding";
	System.out.println(str.contains("z"));
	System.out.println(str.startsWith("Batch"));
	System.out.println(str.endsWith("ing"));
	
	
	}
}
	
	
