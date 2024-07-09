class NumPattern5{
	public static void main(String[]args){
		/*int n=1,col=1,space=2,m=0;
		char ch='$';
		for(int i=1;i<=15;i++){
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=col;j++){
				System.out.print(n++);
			}
			for(int j=1;j<=m;j++){
				System.out.print(ch);
			}
			System.out.println();
			if(i<=2){
			col+=2;space--;
			}else{
			col-=2;space++;}
			if(i>=5){
			space=2;m=1;
			}	
		}*/

		/*int n=1;
		for(int i=1;i<=6;i++){
			for(int j=1;j<=4;j++){
				System.out.print(n++);
				if(n>=10){
					n=1;
				}
			}
			System.out.println();}*/

		/*char ch='a';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==j || i+j==6 || j==3){
				System.out.println(ch++);
				if(ch=='g'){
				continue;}
			
		System.out.println(ch++);
		}*/
		
		char ch='a';
		int n=1,col=1,space=3;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=col;j++){
				if(i%2==1){
				System.out.print(ch++);
				}else{
				System.out.print(n++);
				}
			}
			for(int j=1;j<=space;j++){
				if(i>=4)
				System.out.print(" ");
			}
			for(int j=1;j<=col;j++){
				if(i>=4 && ch>='i')
				System.out.print(ch++);
			}
		System.out.println();
		if(i<=4)
		col++;
		else
		col--;space=4;
		}			
	}
}
			