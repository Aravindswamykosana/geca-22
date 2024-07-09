class Recursion1{
	public static int prod(int n){
		if(n!=0){
			return n%10*prod(n/10);
		}
		return 1;
	}
	public static void main(String []args){
		System.out.println(prod(3281));
	}


	/*public static int sum(int n){
		if(n!=0){
			return n%10+sum(n/10);
		}
		return 0;
	}
	public static void main(String []args){
		System.out.println(sum(3281));
	}*/
}
