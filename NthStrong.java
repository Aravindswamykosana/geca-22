class NthStrong 
{
	public static void main(String[] args) 
	{
		int n=3,c=0,i=1;
		while(c<n){
			int sum=0;
			int k=i;
			while(k!=0){
				int r=k%10;
				int fact=1;
				for(int j=1;j<=r;j++){
					fact*=j;
				}
				sum+=fact;
				k/=10;
			}
			if(sum==i)
				c++;
			i++;
		}
			//if(c==n){
				System.out.println(i-1);
	}
}
