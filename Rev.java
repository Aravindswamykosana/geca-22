class Rev 
{
	public static void main(String[] args) 
	{
		/*int n=523187,res=0;
		while(n!=0){
			int r=n%10;
			if(r%2==0)
			res=res*10+r;
			n/=10;}
			int rev=0;
		while(res!=0){
			int r=res%10;
			rev=rev*10+r;
			res/=10;
		}
		System.out.println(rev);*/

		int n=52418,res=0,p=1;
		while(n!=0){
			int r=n%10;
			if(r%2==0){
			res=r*p+res;
			p=p*10;}
			n/=10;
			}
			System.out.println(res);
	}
}
