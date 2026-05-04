package hierarchicalinheritance;

public class Daughter extends Father {
	public void substraction(int a,int b)
	{
		int sub=a-b;
		System.out.println("substract=" +sub);
		
	}
	

	public static void main(String[] args) {
		
		Daughter obj1=new Daughter();
		obj1.division(25,5);
		obj1.substraction(10,8);
		// TODO Auto-generated method stub

	}

}
