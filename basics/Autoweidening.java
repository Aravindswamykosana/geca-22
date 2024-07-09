class Autoweidening{//or narrowing also
	public static void main(String[]args){
		short a=9;
		int b=a;
		System.out.println(b);
		char c='A';
		int d=c;
		
		System.out.println(d);
		int e=200;
	      double f=e;
		
		System.out.println(f);
		
		long l=1234567938365636l;
		float k=l;
		
		System.out.println(k);

		float p=12236365364765265f;
		long o=(long)p;
		
		System.out.println(o);


	}
}