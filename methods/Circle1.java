import java.util.Scanner;
class  AreaOfCircle{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Circle c1=new Circle();
		System.out.println("enter the radius 1 ::");
		double radius=sc.nextDouble();
		c1.radius=radius;
		c1.circle();
		System.out.println("*************");
		Circle c2=new Circle();
		System.out.println("enter the radius 2 ::");
		double radi=sc.nextDouble();
		c2.radius=radi;
		c2.circle();
		System.out.println("*************");
		Circle c3=new Circle();
		System.out.println("enter the radius 3 ::");
		double radius1=sc.nextDouble();
		c3.radius=radius1;
		c3.circle();
	}
}
