class Strong 
{
	public static void main(String[] args) 
	{
		/*int n=145,sum=0,temp=n;
		while(n!=0){
			int r=n%10;
			int fact=1;
			for(int i=1;i<=r;i++){
				fact=fact*i;
			}
			sum+=fact;
			n/=10;
		}
		if(temp==sum)
		System.out.println("strong number");
		else
			System.out.println("not a strong number");*/


			int m=1,n=100000;
			for(int i=m;i<=n;i++){
				int sum=0,k=i;
				while(k!=0){
					int r=k%10;
					int fact=1;
					for(int j=1;j<=r;j++){
						fact=fact*j;
					}
					sum=sum+fact;
					k/=10;
				}
				if(sum==i){
					System.out.println(i);}
			}
	}
}
