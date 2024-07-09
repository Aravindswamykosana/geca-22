class Neon 
{
	public static void main(String[] args) 
	{
		int m=1,n=10;
		for(int i=m;i<=n;i++){
			int k=i,s=k*k,sum=0;
			while(s!=0){
				int r=s%10;
				sum+=r;
				s=s/10;
			}
			if(sum==i)
		System.out.println(i);
		}
	}
}
