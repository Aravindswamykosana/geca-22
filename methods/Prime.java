class Prime 
{
	public static boolean prime(int n,int i){
		if(n<2){
			return false;
		}
		if(n%i==0){
			return false;
		}
		if(i>n/2){
			return true;
		}
		return prime(n,++i);
	}
	public static void main(String[] args) 
	{
		int n=9;
		if(prime(n,2)){
			System.out.println(n+" is prime");
		}
		else{
			System.out.println(n+" is not a prime");
		}
	}
}
