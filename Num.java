class Num 
{
	public static void main(String[] args) 
	{
		int n=8,col=1;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=col;j++){
				if(i<=4)
					System.out.print(i);
				else if(i>=5)
					System.out.print(n-i);
			}
			System.out.println();
			if(i<=3){
				col++;
			}
			else
				col--;
		}
	}
}
