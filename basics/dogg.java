class Dogg{
	public static void main(String[]args){
		int hrs=17;
		boolean b=true;
		if((hrs<6 || hrs>19) && b)
			System.out.println("danger");
		else
			System.out.println("safe");
	}
}