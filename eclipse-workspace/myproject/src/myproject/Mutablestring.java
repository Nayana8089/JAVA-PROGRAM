package myproject;

public class Mutablestring {

	public static void main(String[] args) {
		
	//reverse()
		
	StringBuffer s =new StringBuffer("hello");
	s.reverse();
	System.out.println(s);
	
	//append()
	
	StringBuffer s1=new StringBuffer("goodday");
	s1.append("nayana");
	System.out.println(s1);
	
	//insert()
	
	StringBuffer s2=new StringBuffer("hppy");
	s2.insert(1,"a");
	System.out.println(s2);
	
	//delete()
	
	StringBuffer s3= new StringBuffer("ohappyy");
	s3.delete(0,1);
	System.out.println(s3);
	
	//replace()
	
	StringBuffer s4=new StringBuffer("hello");
	s4.replace(1, 3, "world");
	System.out.println(s4);
	
	}

}
