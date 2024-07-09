class  Power
{
	public static void power(int m,int n){
		int power=1;
		/*for(int i=1;i<=n;i++){
			power*=m;
		}*/
		/*while(n!=0){
			power*=m;
			n--;
		}*/
		do{
			power*=m;
			n--;
		}while(n!=0);
		System.out.println(power);
	}
	public static void main(String[] args) 
	{
		power(2,5);
		//System.out.println("end of the program");
	}
}
