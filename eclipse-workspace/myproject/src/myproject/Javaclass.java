package myproject;

public class Javaclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//  string equals
		String s1="Good morning";
		String s2="good morning";
		String s3="Good morning";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

//string length
		System.out.println(s1.length());
	
//string equalsIgnoreCase
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));

//String UpperCase
		
		System.out.println(s1.toUpperCase());
		
//lowercase
		
		System.out.println(s1.toLowerCase());
		
//starts with
		
		System.out.println(s1.startsWith("Go"));
		
//ends with
		
		System.out.println(s1.endsWith("g"));
		
//charAt()
		
		System.out.println(s1.charAt(3));
		
//valueOf()
		int x=20;                                                                                                                                                                                                    
		System.out.println(s1.valueOf(x));






		





	}

}
