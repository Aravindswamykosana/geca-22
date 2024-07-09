class Pattern3{
	public static void main(String[]args){
		//wajp to print reverse pyramid?
		int star=5,space=0;		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			System.out.println();
			if(i<=2){
			star-=2;space++;
			}else{
			star+=2;space--;
			}
		}
		
		/*int star=1,space=5;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			for(int j=1;j<=space;j++){
				
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				if(j!=4){
				System.out.print("*");}
			}
			System.out.println();
			star++;space-=2;
		}*/
		//wajp to print butterfly?
		/*int star=1,space=5;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			for(int j=1;j<=space;j++){
				
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				if(j!=4)
				System.out.print("*");
			}
			System.out.println();
			if(i<=3){
			star++;space-=2;}
			else{
			star--;space+=2;}
		}*/
	}
}