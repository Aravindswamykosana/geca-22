class Task2
{
	public static void main(String[] args) 
	{
		int star=1,space=2;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++){
				if(i==3){
					System.out.print("@ ");
				}
				else if((i==4 && (j==1 || j==5)) || (i==5 && (j==1 || j==5))){
					System.out.print("$ ");
				}
				else if((i==5 && (j==2 || j==4))){
					System.out.print("  ");
				}
				else
					System.out.print("* ");
			}
			System.out.println();
			if(i<=2){
				star+=2;space--;
			}
		}
			int m=5;
			for(int i=1;i<=1;i++){
				for(int j=1;j<=m;j++){
					System.out.print("$ ");
				}
				System.out.println();
			}
	}
}
