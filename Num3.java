class Num3 
{
	public static void main(String[] args) 
	{
		int n=1,col=1,space=3;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=col;j++){
				System.out.print(n++);
			}
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=col;j++){
				n--;
				if(!(j==1 && i==3))
					System.out.print(n);
			}
			System.out.println();
			if(i<=2){
				space-=2;
				col++;
			}
			else{
				space+=2;
				col--;
			}
		}

	}
}
