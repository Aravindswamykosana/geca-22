import java.util.Scanner;
class Circle 
{
	public static void circle(float pi,int r)
	{
		System.out.println("circle is:"+(pi*r*r));
	}
	public static void rectangle(int l,int b)
	{
		System.out.println("rectangle is:"+(l*b));
	}
	public static void square(int s)
	{
		System.out.println("sqaure is:"+(s*s));
	}
	public static void traingle(int base,int h)
	{
		System.out.println("traingle is:"+((1/2)*(base*h)));
	}
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pi value:");
		float pi = sc.nextFloat();
		System.out.println("enter r value:");
		int r=sc.nextInt();
		System.out.println("enter s value:");
		int s=sc.nextInt();
		System.out.println("enter b value:");
		int base=sc.nextInt();
		System.out.println("enter h value:");
		int h=sc.nextInt();
		System.out.println("enter l value:");
		int l=sc.nextInt();
		System.out.println("enter b value:");
		int b=sc.nextInt();
		rectangle(l,b);
		square(s);
		circle(pi,r);
		traingle(base,h);
		System.out.println("end");
	}
}
