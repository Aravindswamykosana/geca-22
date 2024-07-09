class Extreme_digit$Mean_digit
{
	public static void main(String[] args) 
	{
		int n=12345,rev=0,sum=0,k=sum;
		while(n!=0){
			int r=n%10;
			sum+=r;
			rev=rev*10+r;
			sum+=rev;
			k=sum;
		}
		System.out.println(k);
	}
}
