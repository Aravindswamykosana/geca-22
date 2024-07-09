class Palindromes 
{
	public static void main(String[] args) 
	{
		int n=6239247,rev=0;
		while(n!=0){
			int r=n%10;
			rev=rev*10+r;
			n/=10;
		}
		int sum=rev%10;
			rev/=10;
		while(rev!=0){
			int r=rev%10;
			sum+=r;
			int k=sum;
			int r1=0;
			while(k!=0){
				r1=r1*10+(k%10);
				k/=10;
			}
		if(sum==r1)
			System.out.println(sum);
		rev/=10;
		}
	}
}
