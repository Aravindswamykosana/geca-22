class NumPattern1{
	public static void main(String[]args){
		/*int n=1,space=2,col=1;
		for(int i=1;i<=3;i++){
			n=1;
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=col;j++){
				if(j<=col/2){
				System.out.print(n+" ");
				n++;
				}else{
				System.out.print(n+" ");
				n--;}
			}
			System.out.println();
			col+=2;space--;
		}*/

		/*int n=1,space=2,col=1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=col;j++){
				if(j<=col/2){
				System.out.print(n+" ");
				n--;
				}else{
				System.out.print(n+" ");
				n++;}
			}
			System.out.println();
			col+=2;space--;
		}*/

	/*	int n=1,space=2,col=1;
		for(int i=1;i<=5;i++){
			n=1;
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=col;j++){
				if(j<=col/2){
				System.out.print(n+" ");
				n++;
				}else{
				System.out.print(n+" ");
				n--;}
			}
			System.out.println();
			if(i<=2){
			col+=2;space--;
			}else{
			col-=2;space++;}
		}*/

		int n=1,space=2,col=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=col;j++){
				if(j<=col/2){
				System.out.print(n+" ");
				n--;
				}else{
				System.out.print(n+" ");
				n++;}
			}
			System.out.println();
			if(i<=2){
			col+=2;space--;
			}
			else if(i>=3){
			n=n-2;
			col-=2;space++;
			}
		}
	}
}