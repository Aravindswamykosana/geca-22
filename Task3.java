class Task3 
{
	public static void main(String[] args) 
	{
		int n=289;
		while(n>9){
			int sum=0;
			while(n!=0){
				int r=n%10;
				sum+=r;
				n/=10;
			}
			n=sum;
		}
			System.out.println(n);
	}
}
