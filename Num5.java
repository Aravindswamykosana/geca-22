class Num5 
{
	public static void main(String[] args) 
	{
		int space=1,col=7,n=1;
		for(int i=1;i<=4;i++){
			n=1;
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=col;j++){
				if(j<=col/2){
					System.out.print(" "+n++);
				}
				else{
					System.out.print(" "+n--);
				}
			}
			System.out.println();
			col-=2;
			space++;
		}
	}
}
