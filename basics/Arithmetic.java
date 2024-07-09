class Arithmetic{
		public static void main(String[]args){
			int a=20;
			int b=30;
			System.out.println("addition:"+(a+b));
			System.out.println("sub:"+(a-b));
			System.out.println("mul:"+(a*b));
			System.out.println("div:"+(a/b));
			System.out.println("mod:"+(a%b));
			int a1=30,b1=30;
			System.out.println("addition:"+(a1+=b1));   //assignment operartors
			System.out.println("div:"+(a1/=b1));
			System.out.println("mod:"+(a1%=b));
			System.out.println("div:"+(a1/b1));
			System.out.println("mul:"+(a1*=b1));
			
		}
}