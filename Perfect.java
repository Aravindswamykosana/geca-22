class perfect
{
	public static void main(String[] args) 
	{
		int m=10,n=1000;
		for(int i=m;i<=n;i++){
			int sum=0;
			for(int j=1;j<=i/2;j++){
			if(i%j==0)
				sum+=j;
		}
		if(sum==i)
		System.out.println(i);
		}
	}
}
