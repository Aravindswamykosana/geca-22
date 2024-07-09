class H2 
{
	static int i=10;
	int j=20;
	public void run(){
		System.out.println(this.i);
		System.out.println(H2.i);
		System.out.println(i);
		System.out.println(j);
		System.out.println(this.j);
	}
	public static void add(){
		System.out.println(i);
		System.out.println(H2.i);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		H2 obj=new H2();
		obj.run();
		obj.add();
		System.out.println(obj.j);
		System.out.println(i);
		System.out.println(H2.i);
		System.out.println(obj.i);
		System.out.println(obj.j);
	}
}
