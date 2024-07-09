class Spynum
{
	public static void main(String[] args) 
	{
		int n=22,sum=0,p=1;
		while(n!=0){
			int r=n%10;
			sum+=r;
			p*=r;
			n/=10;
		}
		if(sum==p){
			System.out.println("spy");
		}else{
			System.out.println("not spy");
		}
	}
}
