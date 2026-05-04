package multilevelinheritance;

public class Son extends Father{

	public static void main(String[] args) {
		
		Son obj= new Son();
		obj.sum(30,40);
		obj.multiply(8, 4);
		obj.display("hello");
		// TODO Auto-generated method stub

	}
	public void display(String a) {
		System.out.println(a);
	}

}
