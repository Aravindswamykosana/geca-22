class PrimeCount
{
	public static void main(String[] args) 
	{
		int n=3458721,rev=0;
		while(n!=0){
			int r=n%10;
			rev=rev*10+r;
			n/=10;
		}
		int c=0,res=0;
		while(rev!=0){
			int r=rev%10;
			c++;
			for(int i=1;i<=c;i++){
				if(r%i==0)
					r++;
			}
			if(c==2){
				res=res*10+r;
			}
			rev/=10;
		}
		System.out.println(res);
	}
}