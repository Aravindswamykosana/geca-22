class P0 
{
	public static void main(String[] args) 
	{
		int star=1,star1=4,space=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=star1;j++){
				System.out.print("*");
			}
			for(int j=1;j<=space;j++){
				if(!(j==1))
					System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			System.out.println();
			star++;
			star1--;
			space++;
		}
	}
}
