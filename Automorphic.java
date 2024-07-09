class  Automorphic
{
	public static void main(String[] args) 
	{
			int m=1,n=10000;
			for(int i=m;i<=n;i++){
				int k=i;
				int s=k*k;
				boolean flag=true;
				while(k!=0){
					if(k%10 !=s%10){
						flag=false;
						break;
					}
					k=k/10;
					s=s/10;
				}
				if(flag)
		System.out.println(i);
			}
	}
}
