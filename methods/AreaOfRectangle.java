import java.util.Scanner;
class  AreaOfRectangle{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the length1 value::");
		Rect r1=new Rect();
		r1.length=sc.nextInt();
		System.out.println("enter the breadth1 value::");
		r1.breadth=sc.nextInt();
		r1.rect();
		System.out.println("Hello World!");

		//Scanner sc1=new Scanner(System.in);
		System.out.println("enter the length2 value::");
		Rect r2=new Rect();
		r2.length=sc.nextInt();
		System.out.println("enter the breadth2 value::");
		r2.breadth=sc.nextInt();
		r2.rect();
		System.out.println("Hello World!");
	}
}
