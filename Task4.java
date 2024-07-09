class Task4 
{
	public static void main(String[] args) 
	{
		int n=1,col=1,space=2,space1=4,n1=0;
		for(int i=1;i<=3;i++){
			 n=1;
			 n1=i;
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
				for(int j=1;j<=space1;j++){
					 System.out.print(" ");
				}
				for(int j=1;j<=col;j++){
					if(j<=col/2){
						System.out.print(n1--);
					}
					else{
						System.out.print(n1++);
					}
				}
				System.out.println();
				col+=2;space--;space1-=2;
		}
	}
}
