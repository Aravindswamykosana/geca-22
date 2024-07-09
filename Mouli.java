class Mouli {
	static int i=10;
	int j=20;
	static {
		System.out.println("sib"+i);
	}
	{
		System.out.println("iib"+j);
	}
	public static void run(){
		System.out.println("from run");
	}
	public static void main(String [] args){
		System.out.println("from main");
		run();
	}
}
