import java.util.Scanner;
class  Bike11{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the bike brand::");
		String brand=sc.next();
		System.out.println("enter the bike speed::");
		double topspeed=sc.nextDouble();
		System.out.println("enter the bike milage::");
		double milage=sc.nextDouble();
		Bike b1=new Bike(brand,topspeed,milage);
		b1.ride();
		b1.travel();

		System.out.println("*************");

		System.out.println("enter the bike brand::");
		String brand1=sc.next();
		System.out.println("enter the bike speed::");
		double topspeed1=sc.nextDouble();
		System.out.println("enter the bike milage::");
		double milage1=sc.nextDouble();
		Bike b2=new Bike(brand1,topspeed1,milage1);
		b2.ride();
		b2.travel();
	}
}
