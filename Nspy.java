class Nspy 
{
	public static void main(String[] args) 
	{
		/*int n=10,c=0;
		int i=1;
		while(c<n){
			int k=i,sum=0,product=1;
				while(k!=0){
					int r=k%10;
					sum+=r;
					product*=r;
					k/=10;
			}	
			if(sum==product){
				System.out.println(i);
				c++;
			}
			i++;
		}*/

		int n=2,c=0;
		int i=1;
		while(c<n){
			int k=i,sum=0,product=1;
				while(k!=0){
					int r=k%10;
					sum+=r;
					product*=r;
					k/=10;
			}
				if(sum==product){
					c++;
				}
				if(c==n){
					System.out.println(i);
				}
			i++;
		}
	}
}
