class Task1 
{
	public static void main(String[] args) 
	{
		int n=538217,rev=0,p=1;
		while(n!=0){
			int r=n%10;
			int c=0;
				for(int i=1;i<=r;i++){
						if(r%i==0){
							c++;
						}
				}
				if(c==2){
					rev=rev+r*p;
					p=p*10;
				}
				n/=10;
		}
		System.out.println(rev);
	}
}
