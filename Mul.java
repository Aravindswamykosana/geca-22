class Mul 
{
	public static void main(String[] args) 
	{
		/*int a=20,b=7;
		int mul=0;
		for(int i=1;i<=b;i++){
			mul+=a;
		}
		System.out.println(mul);*/

		int a=30,b=4;
		int c=0;
		while(a>=b){
			a=a-b;
			c++;
		}
		System.out.println("Quiotent:"+c);
		System.out.println("remainder:"+a);
	}
}
