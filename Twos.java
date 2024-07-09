class Twos
{
	public static void main(String[] args)     //range of 2's count?
	{
		/*int m=2,n=300,c=0;
		for(int i=m;i<=n;i++){
			int k=i;
			boolean b=false;
			while(k!=0){
				int r=k%10;
				if(r==2){
					c++;
					b=true;
				}
				k/=10;
			}
			if(b)
				System.out.println(i);
		}
				System.out.println(c);*/

		int m=20,n=30,c=0;                  //range of 2's count without contain double 22 value?
		for(int i=m;i<=n;i++){
			int k=i;
			boolean b=false;
			while(k!=0){
				int r=k%10;
				if(r==2){
					c++;
					break;
				}
				k/=10;
			}
		}
				System.out.println("count:"+c);
	}
}
