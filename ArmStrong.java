class ArmStrong 
{
	public static void main(String[] args) 
	{
	/*	int n=1533,temp=n;
		int c=0,sum=0;
		while(n!=0){
			c++;
			n/=10;
		}
		n=temp;
		while(n!=0){
			int r=n%10;
			int pow=1;
			for(int i=1;i<=c;i++){
				pow=pow*r;
			}
			sum+=pow;
			n/=10;
		}
		if(sum==temp){
			System.out.println("Armstrong");
		}else{
			System.out.println("not a Armstrong");
		}*/

		int m=100,n=20000;
		for(int i=m;i<=n;i++){
			int sum=0,c=0,temp=i;
			while(temp!=0){
				c++;
				temp/=10;
				}
				temp=i; //re intialize the value;
				while(temp!=0){
					int r=temp%10;
					int p=1;
					for(int j=1;j<=c;j++){
						p*=r;
					}
					sum+=p;
					temp/=10;
				}
			
				if(sum==i){
					System.out.println(i);
				}
		}
	}
}
