class Programs 
{
	public static void main(String[] args) 
	{
		int n=24,sum=0,temp=0;
		while(n!=0){
			int r=n%10;
			sum+=r;
			n/=10;
		}
		if(sum%temp==0)
			System.out.println("harshad");
		else
			System.out.println("not a harshad");
	}
}
		/*int m=1,n=100;
		for(int i=m;i<=n;i++){
			int rev=0,k=i;
			while(k!=0){
				int r=k%10;
				rev=rev*10+r;
				k/=10;
			}
			if(rev==i)
				System.out.println(i);
		}*/