class Recursion1{
	public static void fact(int n){
		if(n>=1){
			return n*fact(--n);
		}
		return 0;
	}
	public static void main(String []args){
			System.out.println(fact(5));
	}
}
