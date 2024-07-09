class Fact 
{
	public static int strong(int m){
		int pow=1;
		for(int j=1;j<=m;j++){
			pow*=j;
		}
		return pow;
	}
	public static void main(String[] args) 
	{
		int n=145,temp=n,s=0;
		while(n!=0){
			int r=n%10;
			s=s+strong(r);
			n/=10;
		}
		if(s==temp){
			System.out.println("strong num");
		}
		else{
			System.out.println("not strong num");
		}
	}
}
