class Prime 
{
	public static void main(String[] args) 
	{
		int n=5243198,p=1,res=0;
		while(n!=0){
			int r=n%10;
			int c=0;
			for(int i=1;i<=r;i++){
				if(r%i==0)
					c++;
			}
			if(c==2){
				res=r*p+res;
				p=p*10;
			}
			n/=10;
		}
			System.out.println(res);
	}
}
