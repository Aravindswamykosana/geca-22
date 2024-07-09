class Pattern1{
	public static void main(String[]args){
		/*wajp to print diamond?
		int star=1,space=3;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			System.out.println();
			if(i<=3){
			star+=2;space--;
			}else{
			star-=2;space++;}
		}*/

		/*wajp to print reverse from based on down program?
		int star=4;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			System.out.println();
			if(i<=3){
			star--;
			}else{
			star++;}
		}*/

		/*wajp to print 
		int star=4,space=1;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=space;j++){
				System.out.print(" ");        ****
			}                                    ***
			for(int j=1;j<=star;j++){		  **
				System.out.print("*");           *
			}						  **
			System.out.println();                ***         
			if(i<=3){                           ****
			star--;space++; 
			}else{
			star++;space--;}
		}*/
		
		/*wajp to print box?
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==1 || i==5 || j==1 || j==5 || (j==2 && i<=2) ||  (j==2 && i>=4) || (j==4 && i<=2) || (j==4 && i>=4)){
				System.out.print("*");}
				else{
				System.out.print(" ");}
			}
			System.out.println();
		}*/
	}
}