class Pattern6{
	public static void main(String[]args){
		/*char ch='a';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i+j==6)
				System.out.print("a");
				else
				System.out.print("*");
			}
		System.out.println();
		}*/

		/*for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i==2 && j==1){
				System.out.print("A ");
				}else if(i==2 && j==3){
				System.out.print("@ ");}
				else if(i==4 && j==2){
				System.out.print("& ");}
				else if(i==4 && j==4){
				System.out.print("# ");}
				else{
				System.out.print("! ");}
			}
		System.out.println();
		}*/
		
		/*int n=8;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i==j || i+j==5)
				System.out.print(n--);
				else
				System.out.print("*");
			}
		System.out.println();
		}*/
		
		/*char ch='a';
		int n=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=5;j++){
				if(j==3)
				System.out.print("+");
				else if(j%2==0)
				System.out.print(n++);
				else
				System.out.print(ch++);
			}
		System.out.println();
		}*/

		/*for(int i=1;i<=5;i++){
		char ch='a';
		int n=1;
			for(int j=1;j<=5;j++){
				if(i==3)
				System.out.print("+");
				else if(i%2==0)
				System.out.print(ch++);
				else
				System.out.print(n++);
			}
		System.out.println();
		}*/

		/*char ch='a';
		int n=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j%2==0){
				System.out.print(ch);ch+=3;}
				else{
				System.out.print(n);n+=3;}
			}
		System.out.println();
		}*/

		/*char ch='a';
		int n=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==3 || j==3){
				System.out.print("#");}
				else if(j%2==0){
				System.out.print(ch++);}
				else{
				System.out.print(n++);}
			}
		System.out.println();
		}*/

		char ch='a';
		int n=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(ch=='e')
				System.out.print(ch++);
				else if(i==j || i+j==6){
				System.out.print(ch++);}
				else{
				System.out.print("*");}
			}
		System.out.println();
		}
	}
}