class AlphabetA{
	public static void main(String[]args){
		/*for(int i=1;i<=6;i++){
			for(int j=1;j<=4;j++){
				if(i==1 || i==3 || j==1 || j==4){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
		System.out.println();
		}*/

		//wajp to print *'s at diagonal?
		/*for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==j){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
		System.out.println();
		}*/
		
		/*for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==1 || i==5 || j==1 || j==5 || i==j || i+j==6){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
		System.out.println();
		}*/
		

		int star=1;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=star;j++){
				System.out.print("* ");
			}
		System.out.println();
		if(i<=3){
			star++;
		}else{
			star--;
		}
	   }
	}
}
	
