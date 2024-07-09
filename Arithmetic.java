
class Arithmetic
{
	public static void add(int a,int b){
		System.out.println("Addition is:"+(a+b));
	}
	public static void sub(int a,int b){
		System.out.println("subtraction is:"+(a-b));
	}
	public static void div(int a,int b){
		System.out.println("division is:"+(a/b));
	}
	public static void main(String[] args) 
	{
		add(10,20);
		sub(20,30);
		div(100,10);
		System.out.println("end of the program");
		mul(10,20);
	}
	public static void mul(int a,int b){
		System.out.println("multiplication is:"+(a+b));
		System.out.println("end of the program");
	}
}
