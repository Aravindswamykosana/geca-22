class Neven 
{
	public static void main(String[] args) 
	{
		/*int n=7,i=1,c=0;
		while(true){
			if(i%2==0){
				System.out.println(i);
				c++;
			}
			if(c==n)
				break;
			i++;
		}*/
		
		int n=7;
		int i=1,c=0;
		while(c<n){
			int fc=0;
			for(int j=1;j<=i;j++){
				if(i%j==0)
					fc++;
				}
				if(fc==2){
					System.out.println(i);
					c++;
				}

				i++;
		}
	}
}
