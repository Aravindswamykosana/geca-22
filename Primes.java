class Primes 
{
	public static void main(String[] args) 
	{
		int n=112223,rev=0;
		while(n!=0){
			int r=n%10;
			rev=rev*10+r;
			n/=10;
		}
		System.out.println(rev);
		int sum=rev%10;
		rev/=10;
		while(rev!=0){
			int r=rev%10;
			sum+=r;
			int k=sum;
			int m=0;
			while(k!=0){
				m=k%10;
				int c=0;
				for(int i=1;i<=m;i++){
					if(m%i==0){
						c++;
					}
				}
				k/=10;
			}
				if(sum==m){
					System.out.println(sum);
					rev/=10;
				}
			}
	}
}
