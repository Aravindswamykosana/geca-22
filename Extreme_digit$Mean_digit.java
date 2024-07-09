class Extreme_digit$Mean_digit
{
	public static void main(String[] args) 
	{
		int n=71854;
		int ed=0,md=0;
		int temp=n;
		while(n!=0){
			if(n==temp || n<10){
				ed=ed+(n%10);
			}
			else{
				md=md+(n%10);
			}
			n/=10;
		}
		System.out.println("ed:"+ed+" "+"md:"+md);
	}
}
