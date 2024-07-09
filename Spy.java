class Spy 
{
	public static void main(String[] args) 
	{
		int m=1,n=200;
		for(int i=m;i<=n;i++){
			int k=i,sum=0,product=1;
			while(k!=0){
				int r=k%10;
				sum+=r;
				product*=r;
				k/=10;
			}if(sum==product)
		System.out.println(i);
		}
	}
}
