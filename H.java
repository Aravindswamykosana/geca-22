class H 
{
	public static void main(String[]args){
		int n=1,space=2;
		int col=1;
		for(int i=1;i<=3;i++){
			n=1;
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			System.out.print("/");
			for(int j=1;j<=col;j++){
				if(j<=col/2){
					System.out.print(n++);
				}
				else{
					System.out.print(n--);
				}
			}
			System.out.print("\\");
			System.out.println();
				col+=2;space--;
		}
	}
}
