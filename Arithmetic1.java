import java.util.Scanner;
class Arithmetic1
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
		System.out.println("start of the program");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=sc.nextInt();
		System.out.println("enter b value:");
		int b=sc.nextInt();
		add(a,b);
		sub(a,b);
		div(a,b);
		mul(a,b);
		System.out.println("end of the program");
	}
	public static void mul(int a,int b){
		System.out.println("multiplication is:"+(a*b));
	}
}
