class HappyNum 
{
	public static void main(String[] args) 
	{
		int n=100;
		while(n!=1 && n!=4){
			int sum=0;
			int s=0;
			while(n>0){
				int r=n%10;
				s=r*r;
				sum+=s;
				n/=10;
			}
			if(sum==1){
				System.out.println("happy num");
			}
			else if(sum==4){
				System.out.println("unhappy num");
			}
			else
				n=sum;
		}
	}
}
