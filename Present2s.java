class Present2s 
{
	public static void main(String[] args) 
	{
		int n=210422252,c=0;
		while(n!=0){
			int r=n%10;
			if(r==2)
			c++;
			n/=10;
		}
		System.out.println("count of 2's:"+c);
	}
}
