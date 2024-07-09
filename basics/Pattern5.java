class Pattern5{
	public static void main(String[]args){
		/*wajp to print kite?
		int space=2,star=1;
		for(int i=1;i<=10;i++){
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++){
				if(i==3 && j==3){
				System.out.print("$ ");
				}else{
				System.out.print("* ");
				}
			}
			System.out.println();	
			if(i<=2){
			star+=2;space--;
			}else{
			star-=2;space++;
			}
			if(i>=5){
			star=1;space=2;}
		}*/

		int star=1,space=3;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=star;j++){
				System.out.print("* ");
			}
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++){	
				System.out.print("* ");
			}
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			
			for(int j=1;j<=star;j++){
				System.out.print("* ");
			}
			System.out.println();
			if(i<=3){
			star++;space-=2;}
			else{
			star--;space++;}
			
			
		}
	}
}