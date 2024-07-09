class Num2 
{
	public static void main(String[] args) 
	{
		/*int n=1;
		int col=1;
		int space=2;
		for(int i=1;i<=3;i++){
			n=1;
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=col;j++){
				if(j<=col/2){
					System.out.print(n++);
				}
				else{
					System.out.print(n--);
				}
			}
			System.out.println();
			col+=2;
			space--;
		}*/

		int n=1,space=2;
		int col=1;
		for(int i=1;i<=5;i++){
			n=1;
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=col;j++){
				if(j<=col/2){
					System.out.print(n++);
				}
				else{
					System.out.print(n--);
				}
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
	}
}
