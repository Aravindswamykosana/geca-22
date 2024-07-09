class Dumble 
{
	public static void main(String[] args) 
	{
		int space=2,col=1,n=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=col;j++){
				System.out.printf("%2d",n++);
			}
			System.out.println();
			if(i<=2){
				col+=2;
				space--;
			}
			else{
				col-=2;
				space++;
			}
		}
		int star=1,space1=2;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=space1;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++){
				System.out.printf("$  ");
			}
			System.out.println();
		}
		int space2=1,col1=1;
		char ch='A';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=space2;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=col1;j++){
				System.out.print("  "+ch++);
			}
			System.out.println();
			if(i<=2){
				col1+=2;
				space2--;
			}
			else{
				col1-=2;
				space2++;
			}
		}
	}
}
