class Bitwise{
	public static void main(String[]args){
		int a=10,b=200;
		int c,d,e,f,g;
	      c=a&b^a|b;
		d=a&c & a^b;
		e=a^d | a|c;
		f=a>>b & a<<c;
		g=a^b^c^d^e^f;
		System.out.println(~(c));
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}		
		