class Palindrome 
{
	public static void main(String[] args) 
	{
		int m=1,n=100;
		for(int i=m;i<=n;i++){
			int rev=0,k=i;
			while(k!=0){
				int r=k%10;
				rev=rev*10+r;
				k/=10;
			}
			if(rev==i)
			System.out.println(i);
		}
	}
}
