class Reverse 
{
	public static void main(String[] args) 
	{
		/*int n=123456;
		int rev=0;
		while(n!=0){
			int r=n%10;
			rev=rev*10+r;
			n/=10;
		}
		System.out.println(rev);*/

		int n=12321,temp=n;
		int rev=0;
		while(n!=0){
			int r=n%10;
			rev=rev*10+r;
			n/=10;
		}
		if(temp==rev){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
	}
}
