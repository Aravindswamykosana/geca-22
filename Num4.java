class Num4 
{
	public static void main(String[] args) 
	{
		char ch='A';
		int n=1,col=1,space=4;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=col;j++){
				if(j%2==0)
					System.out.print(" "+ch++);
				else
					System.out.print(" "+n++);
			}
			System.out.println();
			col+=2;space--;
		}
	}
}
