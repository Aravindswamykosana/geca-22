class Not3 
{
	public static void main(String[] args) 
	{
		int m=20,n=40,c=0;
		for(int i=m;i<=n;i++){
			int k=i;
			boolean b=true;
			while(k!=0){
				int r=k%10;
				if(r==3){
					b=false;
					break;
				}
				k/=10;
			}
			if(b)
			System.out.println(i);
		}
	}
}
