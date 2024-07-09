class NumPattern3{
	public static void main(String[]args){
		/*char ch='a';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print(ch+" ");
				ch++;
			}
		System.out.println();
		}*/
			
		/*int n=1,col=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=col;j++){
				System.out.print(n*n+" ");
				n++;
			}
		System.out.println();
		col++;
		}*/

		int n=1,col=1,space=3;
		for(int i=1;i<=7;i++){
			n=1;
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=col;j++){
			 if(j<=col/2){
				System.out.print(n*n+" ");
				n++;}
			else{
				System.out.print(n*n+" ");
				n--;}
			}
		System.out.println();
		if(i<=3){
		col+=2;space--;
		}else{
		col-=2;space++;}
		}
	}
}