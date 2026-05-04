package hierarchicalinheritance;

public class Son extends Father{
	public void show()
	{
		System.out.println("good");
	}
	public static void main(String[] args) {
		
		Son obj= new Son();
		obj.division(10,2);
		obj.show();
		
		
		// TODO Auto-generated method stub

	}

}
