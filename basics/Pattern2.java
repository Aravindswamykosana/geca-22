class Pattern2{
	public static void main(String[]args){
		//wajp to print box inside symbols?
		/*int n=9;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 || i==n || j==1 || j==n){
					System.out.print("*");}
				else if((i==(n/2)+1 && j==(n/2)+1)){   
					System.out.print("@");}    		
				else if((i+j)==n+1 || i==j){		//i+j%2==0 but not working all values.
					System.out.print("~");}
				else{
					System.out.print(" ");}
			}
			System.out.println();
		}*/
		
		//wajp to print diamond inside symbol?
		/*int star=1,space=3;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				if((i==3 && j==3)){
					System.out.print("$");
				}else{
					System.out.print("*");
				}
			}	
			System.out.println();
			if(i<=2){
			star+=2;space--;}
			else{
			star-=2;space++;}
		}*/

		//wajp to print different swastik?
		/*for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==j || i+j==6 || (i==1 && j<=3) ||  (i==5 && j>=3) ||  (j==1 && i>=3) ||  (j==5 && i<=3)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}	
			System.out.println();
		}*/
		
		int star=1,space=2;
		for(int i=1;i<=8;i++){
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
					System.out.print("*");
			}	
			System.out.println();
			if(i<=5){
			star+=2;space--;}
			else{
			star-=2;space++;}
			if(i==3){
			star=1;
			space=2;}
		}
	}
}