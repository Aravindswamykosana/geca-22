class p1 
{
	public static void main(String[] args) 
	{
		int star=4,space=0,star1=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=star;j++){
			System.out.print("*");
			}
		for(int j=1;j<=space;j++){
			System.out.print(" ");
		}
		for(int j=1;j<=star1;j++){
			System.out.print("*");
		}
		System.out.println();
		star--;space++;star1++;}
	}
}
