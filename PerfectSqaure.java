class PerfectSquare 
{
	public static void main(String[] args) 
	{
		int n=161,s=0;
		for(int i=1;i<=n/2;i++){
			s=i*i;
			if(s>=n){
				break;
			}
		}
			if(s==n){
				System.out.println("perfect square");}
			else{
				System.out.println("not a perfect square");
			}
	}
}
